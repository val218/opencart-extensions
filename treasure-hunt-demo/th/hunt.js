/* Treasure Hunt - shop widget. The server decides where icons hide; this script only shows them. */
(function () {
	'use strict';
	var S = window.TH_STATE, C = window.TH_CFG || {};
	if (!S || window.__thOn) return;
	window.__thOn = 1;

	var ICONS = window.TH_ICONS || {};
	var icon = function (t) { return ICONS[t] || ICONS.coin; };
	var an = function (w) { return /^[aeiou]/i.test(w) ? 'An ' : 'A '; };
	var esc = function (s) { return String(s == null ? '' : s).replace(/[&<>"']/g, function (c) { return {'&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&#39;'}[c]; }); };

	var css = '.th-btn{position:fixed;bottom:18px;z-index:99990;display:flex;align-items:center;gap:8px;background:#fff;color:#1d2329;border:0;border-radius:30px;padding:6px 14px 6px 6px;box-shadow:0 6px 22px rgba(0,0,0,.18);font:600 14px/1.2 system-ui,-apple-system,Segoe UI,Roboto,sans-serif;cursor:pointer}'
		+ '.th-btn svg{width:38px;height:38px;display:block}.th-btn.l{left:18px}.th-btn.r{right:18px}.th-btn.pulse{animation:thpulse 1.4s ease 3}'
		+ '@keyframes thpulse{0%,100%{transform:scale(1)}50%{transform:scale(1.08)}}'
		+ '.th-panel{position:fixed;bottom:76px;z-index:99991;width:330px;max-width:calc(100vw - 24px);background:#fff;color:#1d2329;border-radius:14px;box-shadow:0 12px 40px rgba(0,0,0,.22);font:14px/1.45 system-ui,-apple-system,Segoe UI,Roboto,sans-serif;padding:16px 16px 14px;display:none}'
		+ '.th-panel.l{left:18px}.th-panel.r{right:18px}.th-panel.on{display:block;animation:thin .18s ease}@keyframes thin{from{opacity:0;transform:translateY(8px)}to{opacity:1;transform:none}}'
		+ '.th-panel h4{margin:0 26px 4px 0;font-size:16px;font-weight:700;color:#1d2329}.th-panel p{margin:0 0 10px;color:#4a535c}.th-x{position:absolute;top:8px;right:10px;border:0;background:none;font-size:22px;line-height:1;color:#8a939b;cursor:pointer}'
		+ '.th-dots{display:flex;flex-wrap:wrap;gap:4px;margin:4px 0 12px}.th-dots span{width:24px;height:24px;opacity:.18;filter:grayscale(1)}.th-dots span.on{opacity:1;filter:none}.th-dots svg{width:100%;height:100%}'
		+ '.th-hints{list-style:none;margin:0 0 10px;padding:0;font-size:13px}.th-hints li{display:flex;gap:8px;align-items:center;padding:5px 0;border-top:1px solid #eef1f3}.th-hints li svg{width:20px;height:20px;flex:none}.th-hints li.done{color:#2d7a4b;text-decoration:line-through}'
		+ '.th-small{font-size:12px;color:#7a838c}.th-a{display:inline-block;background:#1d2329;color:#fff!important;border-radius:8px;padding:8px 14px;font-weight:600;text-decoration:none!important}'
		+ '.th-code{display:flex;gap:8px;align-items:center;margin:8px 0}.th-code b{flex:1;font:700 20px/1 ui-monospace,Menlo,Consolas,monospace;letter-spacing:1px;background:#fff7dc;border:2px dashed #e6b422;border-radius:8px;padding:10px;text-align:center}.th-code button{border:1px solid #d5dbe0;background:#fff;border-radius:8px;padding:8px 10px;cursor:pointer;font-weight:600}'
		+ '.th-coin{position:absolute;z-index:99980;width:48px;height:48px;cursor:pointer;border:0;padding:0;background:none;filter:drop-shadow(0 4px 6px rgba(0,0,0,.35));animation:thbob 2.4s ease-in-out infinite}.th-coin svg{width:100%;height:100%;display:block}'
		+ '@keyframes thbob{0%,100%{transform:translateY(0) rotate(-6deg)}50%{transform:translateY(-6px) rotate(6deg)}}'
		+ '.th-fly{position:fixed;z-index:99995;width:48px;height:48px;pointer-events:none;transition:all .8s cubic-bezier(.5,-.3,.6,1)}.th-fly svg{width:100%;height:100%}'
		+ '.th-toast{position:fixed;left:50%;top:22%;transform:translateX(-50%);z-index:99996;background:#1d2329;color:#fff;border-radius:12px;padding:12px 18px;font:600 15px/1.3 system-ui,sans-serif;box-shadow:0 10px 30px rgba(0,0,0,.25);text-align:center}'
		+ '.th-conf{position:fixed;inset:0;pointer-events:none;z-index:99994;overflow:hidden}.th-conf i{position:absolute;top:-20px;width:9px;height:14px;border-radius:2px;animation:thfall 2.6s ease-in forwards}@keyframes thfall{to{transform:translateY(110vh) rotate(720deg)}}'
		+ '@media (max-width:600px){.th-panel{left:12px!important;right:12px!important;width:auto;bottom:72px}.th-btn{bottom:12px}.th-btn.l{left:12px}.th-btn.r{right:12px}}';
	var st = document.createElement('style');
	st.textContent = css;
	document.head.appendChild(st);

	var side = S.position === 'right' ? 'r' : 'l';
	var btn = document.createElement('button');
	btn.type = 'button';
	btn.className = 'th-btn ' + side;
	btn.setAttribute('aria-label', S.name);
	var panel = document.createElement('div');
	panel.className = 'th-panel ' + side;
	panel.setAttribute('role', 'dialog');
	document.body.appendChild(btn);
	document.body.appendChild(panel);

	function day(d) {
		try { return new Date(d + 'T12:00:00').toLocaleDateString(undefined, {day: 'numeric', month: 'long'}); } catch (e) { return d; }
	}

	function renderBtn() {
		var label = S.guest ? 'Play' : (S.won ? 'You won!' : (S.found || 0) + ' / ' + S.goal);
		btn.innerHTML = icon(S.theme) + '<span>' + esc(label) + '</span>';
	}

	function renderPanel() {
		var w = S.words, h = '<button class="th-x" aria-label="Close">×</button><h4>' + esc(S.name) + '</h4>';
		if (S.intro) h += '<p>' + esc(S.intro) + '</p>';
		if (S.won) {
			h += '<p><b>You found all ' + S.goal + ' ' + esc(w[1]) + '!</b> Your prize: ' + esc(S.prize) + '.</p>'
				+ '<div class="th-code"><b>' + esc(S.won.code) + '</b><button type="button" data-copy="' + esc(S.won.code) + '">Copy</button></div>'
				+ '<p class="th-small">Enter the code in your cart. It works once, on your account, until ' + esc(day(S.won.until)) + '.</p>';
		} else if (S.guest) {
			h += '<p>Find ' + S.goal + ' ' + esc(w[1]) + ' hidden on our product pages and win ' + esc(S.prize) + '.</p>'
				+ '<p><a class="th-a" href="' + esc(C.login) + '">Log in to play</a></p><p class="th-small">No account yet? <a href="' + esc(C.register) + '">Create one</a>. Ends ' + esc(day(S.ends)) + '.</p>';
		} else if (S.sold_out) {
			h += '<p>All the prizes for this hunt have been won. Thank you for playing!</p>';
		} else {
			h += '<p>Find ' + S.goal + ' ' + esc(w[1]) + ' hidden on product pages and win <b>' + esc(S.prize) + '</b>.</p><div class="th-dots">';
			for (var i = 0; i < S.goal; i++) h += '<span class="' + (i < S.found ? 'on' : '') + '">' + icon(S.theme) + '</span>';
			h += '</div>';
			if (S.hints && S.hints.length) {
				h += '<div class="th-small" style="margin-bottom:4px">Today\'s ' + esc(w[1]) + ':</div><ul class="th-hints">';
				S.hints.forEach(function (x) {
					h += '<li class="' + (x.found ? 'done' : '') + '">' + icon(S.theme) + '<span>' + (x.found ? 'Found' : an(w[0]) + esc(w[0]) + ' is hiding') + (x.name ? ' on <b>' + esc(x.name) + '</b>' : (x.where ? ' in <b>' + esc(x.where) + '</b>' : ' on a product page') + (x.price ? ', ' + esc(x.price) : '')) + '</span></li>';
				});
				h += '</ul>';
			}
			h += '<p class="th-small">New ' + esc(w[1]) + ' every day. Ends ' + esc(day(S.ends)) + '.</p>';
		}
		panel.innerHTML = h;
	}

	function render() { renderBtn(); renderPanel(); }

	btn.addEventListener('click', function () { panel.classList.toggle('on'); });
	panel.addEventListener('click', function (e) {
		if (e.target.classList.contains('th-x')) panel.classList.remove('on');
		var c = e.target.getAttribute('data-copy');
		if (c) {
			try { navigator.clipboard.writeText(c); e.target.textContent = 'Copied'; } catch (x) {}
		}
	});
	document.addEventListener('keydown', function (e) { if (e.key === 'Escape') panel.classList.remove('on'); });
	render();

	try {
		var k = 'th_seen_' + new Date().toDateString();
		if (!localStorage.getItem(k)) { localStorage.setItem(k, '1'); btn.classList.add('pulse'); }
	} catch (e) {}

	function toast(msg, ms) {
		var t = document.createElement('div');
		t.className = 'th-toast';
		t.innerHTML = msg;
		document.body.appendChild(t);
		setTimeout(function () { t.remove(); }, ms || 2600);
	}

	function confetti() {
		var box = document.createElement('div'), cols = ['#f5c542', '#e8304f', '#2b5d8a', '#2d7a4b', '#f58ab8', '#8fd3f4'];
		box.className = 'th-conf';
		for (var i = 0; i < 90; i++) {
			var p = document.createElement('i');
			p.style.left = Math.random() * 100 + '%';
			p.style.background = cols[i % cols.length];
			p.style.animationDelay = Math.random() * 0.8 + 's';
			box.appendChild(p);
		}
		document.body.appendChild(box);
		setTimeout(function () { box.remove(); }, 4000);
	}

	/* ---------------- the icon on this product page ---------------- */
	if (!S.coin || !C.collect) return;

	function mainImage() {
		var sel = ['.image.magnific-popup img', '.thumbnails li:first-child img', '.thumbnails a.thumbnail img', '#product-image img', '.product-image img', '#content img'];
		for (var i = 0; i < sel.length; i++) {
			var list = document.querySelectorAll(sel[i]);
			for (var j = 0; j < list.length; j++) {
				var r = list[j].getBoundingClientRect();
				if (r.width >= 150 && r.height >= 120) return list[j];
			}
		}
		return null;
	}

	var coin = document.createElement('button');
	coin.type = 'button';
	coin.className = 'th-coin';
	coin.setAttribute('aria-label', 'Collect the ' + S.words[2]);
	coin.innerHTML = icon(S.theme);
	var SPOTS = [[0.08, 0.1], [0.82, 0.12], [0.1, 0.78], [0.8, 0.8], [0.45, 0.06], [0.5, 0.84]];

	function place() {
		var img = mainImage(), spot = SPOTS[S.coin.spot % SPOTS.length];
		if (img) {
			var r = img.getBoundingClientRect();
			coin.style.left = Math.round(window.scrollX + r.left + (r.width - 48) * spot[0]) + 'px';
			coin.style.top = Math.round(window.scrollY + r.top + (r.height - 48) * spot[1]) + 'px';
		} else {
			var h1 = document.querySelector('#content h1, h1');
			var hr = h1 ? h1.getBoundingClientRect() : {left: 20, top: 120, width: 200};
			coin.style.left = Math.round(window.scrollX + hr.left + Math.min(hr.width, 400) + 12) + 'px';
			coin.style.top = Math.round(window.scrollY + hr.top - 6) + 'px';
		}
	}

	function show() {
		document.body.appendChild(coin);
		place();
		window.addEventListener('resize', place);
		window.addEventListener('load', place);
		setTimeout(place, 800);
	}

	if (document.readyState === 'complete') show(); else window.addEventListener('load', show);

	var busy = 0;
	coin.addEventListener('click', function () {
		if (busy) return;
		busy = 1;
		var f = new FormData();
		f.append('p', S.coin.p);
		f.append('k', S.coin.k);
		fetch(C.collect, {method: 'POST', body: f, credentials: 'same-origin', headers: {'X-Requested-With': 'XMLHttpRequest'}})
			.then(function (r) { return r.json(); })
			.then(function (j) {
				if (j.error) { toast(esc(j.error)); busy = 0; return; }
				var r = coin.getBoundingClientRect(), b = btn.getBoundingClientRect();
				var fly = document.createElement('div');
				fly.className = 'th-fly';
				fly.innerHTML = icon(S.theme);
				fly.style.left = r.left + 'px';
				fly.style.top = r.top + 'px';
				document.body.appendChild(fly);
				coin.remove();
				requestAnimationFrame(function () {
					fly.style.left = (b.left + 6) + 'px';
					fly.style.top = (b.top + 6) + 'px';
					fly.style.width = fly.style.height = '38px';
					fly.style.opacity = '.4';
				});
				setTimeout(function () {
					fly.remove();
					S = window.TH_STATE = j.state;
					render();
					if (j.state.event === 'won') {
						confetti();
						panel.classList.add('on');
					} else {
						toast('You found ' + an(S.words[0]).toLowerCase() + esc(S.words[0]) + '! ' + S.found + ' of ' + S.goal);
					}
				}, 820);
			})
			.catch(function () { toast('Something went wrong. Try again.'); busy = 0; });
	});
})();
