# Real Visitors for OpenCart: User Guide

See who is on your shop right now and over any period. Every visit is sorted into **real visitors, customers, not sure yet, likely bots, known bots** and **you**, and you can see why each one is in its group and which pages it opened.

## Requirements

- OpenCart **3.0.x** (tested on 3.0.4.0) or **4.0.x / 4.1.x** (tested on 4.0.2.3, 4.1.0.3 and 4.1.0.4)
- PHP 7.4 or newer (PHP 8.x supported), MySQL or MariaDB
- Works with any theme, Journal included. No core or theme files are changed: everything is hooked in with OpenCart events.

## Installation

### OpenCart 3.0.x
1. Go to **Extensions > Installer** and upload `real_visitors_oc3.ocmod.zip`.
2. Go to **Extensions > Extensions**, choose **Modules**, find **Real Visitors: people or bots** and click the green **Install** button.

### OpenCart 4.0.x / 4.1.x
1. Go to **Extensions > Installer**, upload `real_visitors.ocmod.zip` (keep this exact file name) and click **Install** next to it.
2. Go to **Extensions > Extensions**, choose **Modules**, find **Real Visitors: people or bots** and click **Install**.

That's all. Recording starts straight away and the **dashboard widget** is switched on for you. Open the extension from **Reports > Real Visitors**. You don't need to refresh modifications.

## How a visit is sorted

| Group | Means |
|---|---|
| **You** | This browser opened the shop admin in the last 12 hours. |
| **Known bot** | The browser name says it is a bot (Google, Bing, Ahrefs, OpenAI, Claude, uptime monitors, curl/Python scripts, headless browsers and about 90 more), or it has no browser name at all, or it matches one of your own bot words. |
| **Customer** | Logged in to a customer account. |
| **Real visitor** | The page's script ran **and** someone moved the mouse, used the scroll wheel, touched the screen or typed. |
| **Likely bot** | No script ran (3+ pages, or it never ran), no browser language, pages less than 2 seconds apart, or the visit comes from a server network such as AWS, Google Cloud, Hetzner, OVH or DigitalOcean. |
| **Not sure yet** | The script ran but there was no movement yet. These are often people who left quickly. |

Click any visit to see the reasons, the referrer, the language, time zone and screen size, the full browser name and every page opened, with its title and time.

### How it works
- Each shop page view is recorded on the server: one row per visit (keyed by the OpenCart session) and one row per page. AJAX calls and form posts don't count.
- A tiny script (under 1 KB, no cookies of its own, no outside service) tells the server that a real browser ran the page, and sends one more signal on the first mouse move, scroll, touch or key press.
- Visitors that refuse cookies are grouped by IP + browser for 30 minutes.

## The Visitors page

- **Periods:** Online now (15 minutes), Last hour, Today, Yesterday, 7 days, 30 days.
- **Headline numbers:** people, the share of visits that are bots, page views, and how many people put something in the cart.
- **Group tiles:** the number of visits in each group. Click a tile to list only that group.
- **Chart:** visits by hour (Today, Yesterday) or by day (7 and 30 days), split into people, not sure and bots.
- **Search:** filter by IP, page, device, customer name, referrer or browser name.
- **Side panels:** where people came from, the pages they landed on (shown by page title), people by device (computer, phone, tablet) and bots by name.
- The page refreshes itself every 30 seconds while you watch Online now, Last hour or Today.

## Dashboard widget

It shows people online now, not sure yet, people today and bots today, plus the last 15 minutes of visits with people first. Change its width or position, or switch it off, in **Extensions > Extensions > Dashboard > Real Visitors**.

## Settings & privacy

| Setting | What it does |
|---|---|
| Record shop visits | Pause or resume recording. |
| Keep visit data for | 1-400 days (30 by default). Older visits are deleted automatically. |
| Refresh the Visitors page every | Off, 15 s, 30 s, 1 min or 2 min. |
| Do not record these IP addresses | One per line: `203.0.113.7`, a range `10.0.0.0/8`, or a start `192.168.*`. **Add my IP** fills in yours. |
| Extra bot names | Words that mark a browser as a bot, for example a price checker or your own monitor. |
| Shorten IP addresses | Stores `203.0.113.0` instead of `203.0.113.7` (IPv6: the first 48 bits). This also turns off the network name lookup. |
| Look up the network name of visitors | Reverse DNS, used to spot visits from server networks. It runs while you view the page, for at most 4 seconds per refresh. |
| Respect Do Not Track / Global Privacy Control | Browsers that send these signals are not recorded at all. |
| Text for your privacy policy | Ready-made wording that follows your settings. Copy it into your privacy policy. |
| Delete all visit data | Empties the visit tables. |

**Privacy note:** the extension stores IP addresses (or shortened ones), browser names, language, screen size, time zone, referrer and the pages opened, for the number of days you choose. It reuses the OpenCart session cookie and sets no cookies of its own. Check with your own advisor what your privacy policy needs to say.

## Troubleshooting

| Problem | Fix |
|---|---|
| Everyone shows as "Not sure yet" or "Likely bot" | Open a shop page and check that the page source contains `RVS_BEACON`. If a full-page cache plugin serves cached pages, exclude the beacon route (`extension/module/real_visitors/beacon` on OC3, `extension/real_visitors/module/real_visitors.beacon` on OC4) and let the footer run. |
| All visitors have the same IP | Your shop is behind a proxy or CDN (such as Cloudflare) that doesn't pass the visitor's IP to PHP. Set up your web server to restore the real visitor IP (for example Cloudflare's `CF-Connecting-IP` with mod_remoteip). |
| My own visits show as "Real visitor" | They show as "You" only in a browser that opened the shop admin in the last 12 hours. Add your IP under **Do not record these IP addresses** to leave them out completely. |
| "Permission denied" | Go to **System > Users > User Groups** and tick `extension/module/real_visitors` (OC3) or `extension/real_visitors/module/real_visitors` (OC4) for Access and Modify. |
| No widget on the dashboard | Go to **Extensions > Extensions > Dashboard > Real Visitors**, install it if needed, and set Status to Enabled. |

## Uninstall

Go to Extensions > Extensions > Modules > Real Visitors > Uninstall. The events, menu entry, settings and dashboard widget are removed. Visit data stays until you reinstall or delete it, or until it ages out. Use **Delete all visit data** first if you want it gone.
