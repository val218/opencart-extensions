# Store Doctor for OpenCart: User Guide

A health check for your shop. Store Doctor looks at security, extensions, errors, SEO and content, speed and server, EU rules for online shops, and OpenCart 4 readiness. It explains every problem in plain words, tells you how to fix it, and fixes the safe ones for you with one click. Every fix can be undone.

**The check only reads.** It never changes your shop. Changes happen only when you click a fix button, and each one is recorded in **Fix history**.

## Requirements

- OpenCart **3.0.x** (tested on 3.0.4.0) or **4.0.x / 4.1.x** (tested on 4.0.2.3, 4.1.0.3 and 4.1.0.4)
- PHP 7.4 or newer (PHP 8.x supported)
- Admin only. Nothing is added to your shop pages, so it can't slow them down or clash with your theme.

## Installation

### OpenCart 3.0.x
1. Go to **Extensions > Installer** and upload `store_doctor_oc3.ocmod.zip`.
2. Go to **Extensions > Extensions**, choose **Modules**, find **Store Doctor: shop health check** and click **Install**.

### OpenCart 4.0.x / 4.1.x
1. Go to **Extensions > Installer**, upload `store_doctor.ocmod.zip` (keep this exact file name) and click **Install** next to it.
2. Go to **Extensions > Extensions**, choose **Modules**, find **Store Doctor: shop health check** and click **Install**.

Open it from **System > Store Doctor**. The first check runs straight away and takes a few seconds. A **dashboard widget** with your health score is switched on automatically.

## What it checks

| Tab | Checks |
|---|---|
| **Security** | OpenCart and PHP versions; leftover `install` folder; storage folder inside the public web folder; admin folder still called "admin"; easy-to-guess admin user names; HTTPS; PHP errors shown to visitors; world-writable `config.php`; maintenance mode left on; SEO URLs switched on without `.htaccess` |
| **Extensions** | Installed extensions with missing files; events pointing to deleted extensions (a common cause of blank pages); every extension added to OpenCart; active and switched-off OCMOD modifications |
| **Errors** | The error log read for you. The same error is grouped together and shown with how often it happens, when it last happened, which extension or modification it comes from, and what it means |
| **SEO & content** | Missing meta titles and descriptions (per language); duplicate SEO keywords; products without an SEO keyword, category or image; image files that are missing on the server; enabled products that cost 0 |
| **Speed & server** | PHP extensions OpenCart needs; OPcache; memory limit; database size and largest tables; old MyISAM tables; thousands of expired sessions; unfinished checkouts; oversized uploaded images; size of the resized-image cache |
| **EU rules** (new in 1.1.0) | The rules EU online shops must follow, each with what it asks for and how to meet it: the **withdrawal button** (required since 19 June 2026), the **lowest price in the last 30 days** next to sale prices (Omnibus), **product safety details** on product pages (GPSR, including products with no manufacturer set), an **accessibility statement** page (European Accessibility Act; micro-businesses are exempt), **cookie consent** when tracking scripts such as Google Analytics or a Facebook pixel are found, and the **withdrawal waiver for downloads** when you sell digital products. If your store address is in the EU, missing items count as problems; outside the EU they show as "Good to know", because they only apply to sales to EU consumers. Store Doctor recognises the usual extensions and pages; if you handle a rule another way, click **Ignore this**. It is a checklist, not legal advice |
| **OpenCart 4 readiness** | On OpenCart 3: whether your theme, added extensions and modifications need OpenCart 4 versions, whether PHP is new enough, how much data there is to move, and an overall upgrade size (Small, Medium or Large). Click **Has an OpenCart 4 version** next to an extension you've already checked (or your own, which you'll move yourself) and it moves to the ready list. On OpenCart 4: whether you're on the newest release |

Each finding is marked **Serious**, **Look at this**, **Good to know** or **OK**. The **health score** (0-100) goes down for serious problems and things to look at. OpenCart 4 readiness never lowers the score.

### Ignore
If a finding doesn't apply to you (for example you keep the admin folder name on purpose), click **Ignore this**. It stops counting towards the score and moves to the bottom. Click **Stop ignoring** to bring it back.

## One-click fixes

Only safe changes have a fix button:

| Fix | What it does | Undo |
|---|---|---|
| Hide errors from visitors | Turns off "Display Errors"; errors are still written to the log | Yes |
| Switch off broken events | Turns off events that point to deleted extensions (they stay in the list) | Yes |
| Fill empty meta titles | Copies the product name into empty meta titles only | Yes (empties them again) |
| Delete expired sessions | Removes visitor sessions that have already expired; active visitors are not affected | Not needed |
| Empty the image cache | Deletes resized copies in `image/cache`; OpenCart makes new ones when pages are visited | Not needed |

Everything else (deleting the install folder, moving the storage folder, HTTPS, PHP version) comes with clear steps instead, because those changes are best made by you or your host.

## Fix history

Every fix is listed with the date, the admin user and the result. Click **Undo** to reverse it.

## Troubleshooting

| Problem | Fix |
|---|---|
| "Permission denied" | Go to **System > Users > User Groups** and tick `extension/module/store_doctor` (OC3) or `extension/store_doctor/module/store_doctor` (OC4) for Access and Modify. |
| Errors tab is empty, but the shop has errors | Turn on **Log Errors** in System > Settings > Server. |
| OPcache shows as off, but your host says it is on | Some hosts use different PHP settings for the admin. If the shop is fast, you can ignore this finding. |
| No widget on the dashboard | Go to **Extensions > Extensions > Dashboard > Store Doctor**, install it if needed, and set Status to Enabled. |

## Uninstall

Go to Extensions > Extensions > Modules > Store Doctor > Uninstall. The menu entry, settings and dashboard widget are removed. Fix history is kept, so earlier fixes can still be undone if you reinstall.
