# Product Answers for OpenCart: User Guide

A question box for your shop that answers shoppers from **your own shop data**: products, prices, stock, attributes, options, information pages, and answers you write yourself. It needs **no AI service, no API key and no monthly fee**, and nothing a shopper types leaves your shop.

## What it answers

| Shopper asks | Product Answers shows |
|---|---|
| "Do you have the iPhone?", "canon camera", "iphnoe" (typo) | The matching products with photo, price (special prices included), and stock |
| "Anything under 100?", "laptops over 1000", "cheapest apple product" | Products filtered and sorted by price, in the shopper's currency |
| "How heavy is it?", "what colours?", "does it have bluetooth?", "price?", "is it in stock?" on a product page | The facts from **that** product: weight, size, model, attributes, options, the matching sentence of the description, price, and stock |
| "Do you ship to Germany?", "is there a warranty?" | Your own answer, or the matching part of an information page (Delivery, Returns, Terms) with a link |
| "What's the weather tomorrow?" | An honest "I can only answer questions about our products and shop" and a link to your contact page |

It **never makes things up**. Every answer is taken from your shop. If the answer isn't there, it says so. If a product page doesn't mention something, it says "I could not find that in the details of …" and shows other products that do mention it.

## Requirements

- OpenCart **3.0.x** (tested on 3.0.4.0) or **4.0.x / 4.1.x** (tested on 4.0.2.3, 4.1.0.3 and 4.1.0.4)
- PHP 7.4 or newer (PHP 8.x supported), MySQL or MariaDB
- Works with any theme, Journal included. No core or theme files are changed: everything is hooked in with OpenCart events.

## Installation

### OpenCart 3.0.x
1. Go to **Extensions > Installer** and upload `product_answers_oc3.ocmod.zip`.
2. Go to **Extensions > Extensions**, choose **Modules**, find **Product Answers** and click the green **Install** button.

### OpenCart 4.0.x / 4.1.x
1. Go to **Extensions > Installer**, upload `product_answers.ocmod.zip` (keep this exact file name), and click **Install** next to it.
2. Go to **Extensions > Extensions**, choose **Modules**, find **Product Answers** and click **Install**.

That's all. On install it reads your catalogue (a few seconds for most shops), and the **Ask a question** button appears at the bottom of every shop page. Open the extension from **Catalog > Product Answers**. You don't need to refresh modifications.

## Admin pages

### What people ask
- How many questions were asked in the last 30 days, and how many were answered from your shop data.
- **Questions without an answer**: each one with how often it was asked. Click **Write an answer** and it opens a new answer with the question filled in. Once saved, those questions count as answered. Use **Dismiss** for questions you don't want to answer (for example, the weather).
- **Latest questions**: what was asked, on which product page, and what answered it.

### Try it
Ask as a customer would, optionally "on the page of" a product, and see exactly what shoppers see. Questions asked here are not saved.

### Your answers
Short answers for things your product data can't answer, such as delivery times, warranty, opening hours or which product suits whom.
- **Question**: the main question.
- **Other ways people ask it**: words and phrases separated by commas, such as `shipping time, when will it arrive, deliver to`.
- **Answer**: plain text.
- **Link** (optional): shown as "Read more".
- **Language**: all languages, or one.

### Settings
- **Question box**: on or off, every page or product pages only, bottom right or left, your colour, and products per answer (1–8).
- **Wording**: every text shoppers see, for each shop language. English, Latvian, German, Russian, Spanish and French are built in. For other languages, type your own. Empty fields use the built-in wording.
- **Words that mean the same**: one group per line, such as `hoodie, sweatshirt, jumper`, for the words your customers use that your product texts don't. Common shop groups (delivery/shipping, returns/refund, colour/color, size/dimensions and more) are built in.
- **Privacy**: keep the questions or not, for how many days, and delete them all.
- **Index**: how many products, information pages and answers are searchable. **Rebuild index** after a big import.

## How it works
- A word index of your products (name, model, SKU and other codes, brand, categories, tags, attributes, options, meta keywords, and description), information pages and your answers is kept in your shop database.
- Questions are matched word by word, and the matching also handles:
  - different word endings ("boards" finds "board", "piegādi" finds "piegāde")
  - small typos
  - words that mean the same
  - question words in English, Latvian, German, Russian, Spanish and French: price, stock, cheapest, under/over an amount, weight, size, colour, and model
- Prices, specials, tax, currency and stock come from OpenCart itself at the moment of the question, so they are always current.
- Products and information pages are re-indexed when you save them. Products changed by imports or other extensions are picked up automatically within about 10 minutes.
- Speed: on a test shop with 5,000 products, answers took 12–75 ms and a full index rebuild took about 10 seconds.

## Privacy
- Questions are kept only if you want (on by default, 90 days). E-mail addresses and phone numbers are removed before saving. No names, IP addresses or cookies are stored with the questions.
- The box sets no cookies of its own and loads nothing from outside your shop.
- At most 20 questions a minute are accepted from one address, which protects the shop from scripts.

## Limits (honestly)
- It finds and shows facts. It doesn't write long explanations or compare products in sentences the way ChatGPT does.
- Answers can only be as good as your product data. The **Questions without an answer** list shows you what to add.
- Prices in the price filter are compared in the shopper's currency, including tax if your shop shows prices with tax.

## Uninstalling
Uninstall it in **Extensions > Extensions > Modules**. Its tables, settings and events are removed. Your products are never changed.

## Support
Open an issue at https://github.com/val218/opencart-extensions/issues with your OpenCart and PHP version and what happened. Please don't post passwords or customer details.
