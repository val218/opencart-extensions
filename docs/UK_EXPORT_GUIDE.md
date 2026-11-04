# UK Accounting Export - User Guide

Turns paid orders into a sales ledger and records expenses in the HMRC Self Assessment categories used for Making Tax Digital quarterly updates. Prepares figures and CSV exports; it does **not** submit anything to HMRC.

## Requirements
- OpenCart 3.0.x or 4.0.x / 4.1.x (tested on 3.0.4.0, 4.0.2.3, 4.1.0.3, 4.1.0.4)
- GBP set up as a currency in the store

## Install
**OpenCart 3:** Extensions > Installer → upload `uk_export_oc3.ocmod.zip` → Extensions > Extensions > Modules → UK Accounting Export → Install.
**OpenCart 4:** Extensions > Installer → upload `uk_export.ocmod.zip` (keep the file name) → Install → Extensions > Extensions > Modules → Install.
Find it under **Reports > UK Accounting Export**.

## Setup
1. **Settings:** business name, optional UTR, update periods (standard 6 Apr-5 Apr, or calendar quarters - must match your MTD software), VAT registered or not.
2. **Which orders count as sales:** pick the "paid" and "refund" statuses. A sale is dated the first time the order reaches a paid status.

## Using it
- **Quarterly overview:** each quarter's turnover, other income, expenses and profit, the filing deadline (7 Aug, 7 Nov, 7 Feb, 7 May), and the year-to-date figures that MTD quarterly updates require.
- **Sales:** every paid order and refund in the tax year, converted to GBP.
- **Expenses & other income:** add costs with an HMRC category (cost of goods, postage/travel, premises, admin, advertising, professional fees, bank charges, …) and income that didn't come through the shop.
- **Exports:**
  - MTD quarterly summary - every category for Q1-Q4 plus the cumulative column to submit
  - Sales ledger and expenses ledger
  - Statement-style CSV (Date, Amount, Payee, Description, Reference) for Xero, QuickBooks or FreeAgent

## Notes
Making Tax Digital for Income Tax applies to sole traders and landlords above HMRC's income threshold (from 6 April 2026: over £50,000). Submit with MTD-compatible software and check figures with your accountant. Expense records are kept if the module is uninstalled.
