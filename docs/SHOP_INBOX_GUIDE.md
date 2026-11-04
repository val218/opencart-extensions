# Shop Inbox - User Guide

Your shop's email inside the OpenCart admin. Every conversation shows the customer's account and orders beside it, and follow-up reminders make sure nothing is forgotten.

## Requirements
- OpenCart 3.0.x or 4.0.x / 4.1.x (tested on 3.0.4.0, 4.0.2.3, 4.1.0.3, 4.1.0.4), PHP with OpenSSL and mbstring
- A mailbox with IMAP and SMTP access (cPanel/hosting mail, Gmail/Google Workspace, Microsoft 365, Zoho…)
- No PHP IMAP extension needed (it was removed from PHP 8.4); works on shared hosting

## Install
**OpenCart 3:** Extensions > Installer → upload `shop_inbox_oc3.ocmod.zip` → Extensions > Extensions > Modules → Shop Inbox → Install.
**OpenCart 4:** Extensions > Installer → upload `shop_inbox.ocmod.zip` (keep the file name) → Install → Extensions > Extensions > Modules → Install.
An **Inbox** item appears in the admin menu, with a count of unread conversations and due follow-ups.

## Connect a mailbox
Mail accounts → choose your provider (fills in servers and ports) → email, user name, password → **Connect**. The login is checked before saving and the Sent folder is found automatically.
Gmail and Microsoft 365 need an **app password** (turn on 2-step verification first). Passwords are encrypted (AES-256) with a key kept in OpenCart's storage folder.

## Daily use
- **Inbox views:** Inbox, Needs reply, Follow-ups due, Waiting for customer, All reminders, Done, Newsletters & automatic, All mail. Search covers subject, names, addresses and message text.
- **Customer panel:** account details and the last 10 orders with status and total, plus any order number mentioned in the email (#1042, "order 1042", "pasūtījums 1042"). One click opens the order.
- **Reply:** templates with {name} and {order_id}, signature per account. Replies keep the email thread intact and a copy is saved in your Sent folder.
- **Remind me if no reply in N days:** if the customer answers, the reminder is cleared automatically; if not, the conversation appears under *Follow-ups due*.
- **Remind me:** later today, tomorrow, in 3 days, next Monday, in 2 weeks, or a date with a note.
- **Done:** archives the conversation until the customer writes again.

## Safety
- Emails are shown in a sandbox where scripts can never run; remote images are blocked until you click "Show images".
- Mail stays on your mail server; Shop Inbox keeps a working copy for search and matching. Reading a message marks it read on the server too.

## Checking for mail
New mail is fetched when the Inbox is open and every 2 minutes while it stays open, in small batches so it never times out on shared hosting.
