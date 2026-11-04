# AI Writer for OpenCart - User Guide

Write product and category descriptions, SEO meta, translations and Journal 3 blog articles with Claude, OpenAI or Gemini. Review everything before it is saved and undo any change in one click.

## Requirements

- OpenCart **3.0.x** (tested on 3.0.4.0) or **4.0.x / 4.1.x** (tested on 4.0.2.3, 4.1.0.3 and 4.1.0.4)
- PHP 7.4+ with cURL (PHP 8.x supported)
- An API key from Anthropic (Claude), OpenAI or Google Gemini. Demo mode works without a key, so you can try everything first.
- Works with any theme, including Journal 3. No core files are modified, so it does not conflict with other extensions.

## Installation

### OpenCart 3.0.x
1. Go to **Extensions > Installer** and upload `ai_writer_oc3.ocmod.zip`.
2. Go to **Extensions > Extensions**, choose **Modules**, find **AI Writer** and click the green **Install** button.
3. Click **Edit** (or open **Catalog > AI Writer**).

### OpenCart 4.0.x / 4.1.x
1. Go to **Extensions > Installer**, upload `ai_writer.ocmod.zip` (keep this exact file name) and click **Install** next to it.
2. Go to **Extensions > Extensions**, choose **Modules**, find **AI Writer** and click **Install**.
3. Click **Edit** (or open **Catalog > AI Writer**).

No "Refresh modifications" step is needed - AI Writer uses OpenCart events.

## First setup (2 minutes)

1. Open **Settings**.
2. Pick a provider and paste your API key. Links to get a key are shown under the field.
3. Leave **Model** empty - AI Writer picks a fast, low-cost model that writes well. Or click **Load my models** to choose one.
4. Click **Test connection**.
5. Fill in **Brand voice**: store name, your customers, a few lines about your store, and a tone. This is what makes the text sound like you.
6. Click **Save settings**.

## Features

### Bulk writer
1. Choose products or categories. Filters: category, brand, status, "empty description", "empty SEO meta", "never improved by AI", or search.
2. Choose fields (description, meta title, meta description, meta keywords, tags, name, SEO URL) and languages.
3. Choose **Only fill empty fields** or **Replace existing text**, and **Review before saving** or **Save automatically**.
4. Click **Write**. Results appear as they are ready. Edit any field, untick what you don't want, then **Save** per item or **Save all ready**.

Pause or stop anytime. Busy/rate-limit errors are retried automatically; failed items get a **Retry** button.

### Translate store
Pick a source language and target languages. AI Writer translates names, descriptions, meta and tags, keeping HTML formatting, brand names and model numbers intact. Missing language rows are created automatically.

### Write with AI on the edit form
Every product and category edit form gets an **AI** bar above each language's description: **Write description**, **SEO fields** or **Both**. Add an optional **Note** ("mention it is a limited edition"). Works on unsaved new products too - just type the name first. **Undo** restores what was there.

### Blog articles (Journal 3)
Enter a topic, optional notes, length and languages, and pick up to 8 products to feature. The article links to them with their real URLs. If Journal 3's blog is installed, **Save as Journal draft** creates a *disabled* post (with category and tags) for you to review in Journal > Blog. Without Journal, use **Copy HTML**.

### History & undo
Every save is recorded with the exact previous text. Undo one item from its result card, or a whole run from **History & undo**.

## Quality and safety

- The AI may only use facts from your product data (name, brand, model, categories, attributes, options, weight, dimensions, existing description). It is told never to invent specs, certifications or claims.
- HTML is cleaned before saving: no scripts, styles, inline attributes or unsafe links.
- Meta titles are kept within 60 characters (including your ending), meta descriptions within 160.
- SEO URLs are made unique automatically.
- Your API key is stored in your own database and only sent to the provider you chose.

## Costs

You pay your AI provider directly. A full product (description + all SEO fields) is roughly 1,000-2,500 tokens. Small, fast models are inexpensive - check your provider's current pricing. **Settings > Usage log** shows the tokens used per call.

## Troubleshooting

| Problem | Fix |
|---|---|
| "API key was rejected" | Re-paste the key in Settings, check it is active and has credit. |
| "Rate limit" errors | Set **Items in parallel** to 1 or 2. |
| "Model not found" | Clear the Model field (automatic) or click **Load my models**. |
| "Permission denied" | System > Users > User Groups: tick `extension/module/ai_writer` (OC3) or `extension/ai_writer/module/ai_writer` (OC4) for Access and Modify. |
| No AI bar on the product form | Settings > "AI buttons on the edit forms" must be **Show**; clear your browser cache. |
| Blog: "Journal 3 blog tables were not found" | Journal's blog isn't installed - use **Copy HTML**. |

## Uninstall
Extensions > Extensions > Modules > AI Writer > Uninstall. Your settings and menu/event hooks are removed. History is kept so earlier changes can still be undone if you reinstall.
