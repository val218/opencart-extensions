/* Treasure Hunt demo: plays the hunt in this browser (the real extension does this on the shop's server). */
(function () {
  var HIDE = {"9102": "Women", "9421": "Women", "9113": "Women", "9202": "Men", "9512": "Men", "9302": "Kids"}, GOAL = 6, KEY = 'th_demo_bf';
  function load() { try { return JSON.parse(localStorage.getItem(KEY)) || []; } catch (e) { return []; } }
  function save(f) { try { localStorage.setItem(KEY, JSON.stringify(f)); } catch (e) {} }
  var mem = load();
  function found() { return mem; }
  function state(pid) {
    var f = found(), s = {name: 'Black Friday hunt', theme: 'coin', words: ['coin', 'coins', 'gold coin'], goal: GOAL, ends: '2026-11-30',
      prize: '20% off on orders over 50.00€', intro: 'Gold coins are hidden around the shop this week. Find 6 and win 20% off. Only 100 prizes!', position: 'left', guest: false, found: f.length};
    if (f.length >= GOAL) { s.won = {code: 'HUNTBF2026', until: '2026-12-14'}; return s; }
    s.hints = Object.keys(HIDE).map(function (p) { return {where: HIDE[p], found: f.indexOf(+p) >= 0 ? 1 : 0}; });
    if (pid && HIDE[pid] && f.indexOf(pid) < 0) s.coin = {p: pid, k: 'demo', spot: pid % 6};
    return s;
  }
  window.TH_STATE = state(window.TH_DEMO_PAGE || 0);
  window.TH_CFG = {collect: 'th-collect', login: '#', register: '#'};
  var real = window.fetch ? window.fetch.bind(window) : null;
  window.fetch = function (u, o) {
    if (String(u).indexOf('th-collect') >= 0) {
      var pid = +(o && o.body && o.body.get ? o.body.get('p') : 0), f = found();
      if (HIDE[pid] && f.indexOf(pid) < 0) { f.push(pid); mem = f; save(f); }
      var s = state(0); s.event = f.length >= GOAL ? 'won' : 'found';
      return Promise.resolve(new Response(JSON.stringify({state: s}), {headers: {'Content-Type': 'application/json'}}));
    }
    if (/route=(checkout\/cart|account\/wishlist|product\/compare|common\/cart)/.test(String(u))) {
      alert('This is a demo shop: nothing can be bought here.');
      return Promise.resolve(new Response('{}', {headers: {'Content-Type': 'application/json'}}));
    }
    return real ? real(u, o) : Promise.reject();
  };
  document.addEventListener('click', function (e) {
    var a = e.target.closest && e.target.closest('a');
    if (!a) return;
    if (a.id === 'th-demo-reset') { e.preventDefault(); mem = []; save([]); location.reload(); }
    else if (a.getAttribute('href') === '#demo-off') { e.preventDefault(); alert('This page is not part of the demo. Look for the coins on the product pages.'); }
  }, true);
  if (window.jQuery) jQuery(document).ajaxSend(function (ev, xhr, opt) { if (/route=/.test(opt.url)) { xhr.abort(); if (/cart|wishlist|compare/.test(opt.url)) alert('This is a demo shop: nothing can be bought here.'); } });
})();
