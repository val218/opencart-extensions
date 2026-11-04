# Saimnieciskās darbības žurnāls - lietošanas instrukcija

Ieņēmumu un izdevumu uzskaites žurnāls vienkāršā ieraksta sistēmā, aizpildīts automātiski no apmaksātiem pasūtījumiem. Formāts atbilst MK noteikumiem par grāmatvedību vienkāršā ieraksta sistēmā (likumi.lv/ta/id/332883): **1. pielikums** (IIN maksātāji, 24 ailes) un **2. pielikums** (MUN maksātāji, 15 ailes).

## Prasības
- OpenCart 3.0.x vai 4.0.x / 4.1.x (pārbaudīts ar 3.0.4.0, 4.0.2.3, 4.1.0.3, 4.1.0.4)
- Veikalā jābūt valūtai EUR

## Uzstādīšana
**OpenCart 3:** Extensions > Installer → augšupielādējiet `lv_journal_oc3.ocmod.zip` → Extensions > Extensions > Modules → "Saimnieciskās darbības žurnāls (LV)" → Install.
**OpenCart 4:** Extensions > Installer → augšupielādējiet `lv_journal.ocmod.zip` (nemainiet faila nosaukumu) → Install → Extensions > Extensions > Modules → Install.
Modulis atrodams izvēlnē **Reports > Saimn. darbības žurnāls**.

## Pirmie soļi
1. **Iestatījumi:** izvēlieties IIN vai MUN maksātāju, ievadiet vārdu/IU nosaukumu, kodu un adresi.
2. **Statusi:** atzīmējiet, kuri pasūtījumu statusi nozīmē "nauda saņemta" un kuri - atmaksu.
3. **Maksājumu veidi:** katram maksājuma veidam izvēlieties aili - Kase (skaidra nauda), Maksājumu konts (banka) vai Citi (PayPal, Stripe, kartes).
4. **PVN maksātājs:** ja "Jā", PVN tiek ierakstīts 17. ailē, apgrozījumā - summa bez PVN.
5. **Sākuma atlikumi:** ievadiet kases, konta un citu līdzekļu atlikumu gada sākumā.
6. **Pārskats → Ierakstīt žurnālā:** apmaksātie pasūtījumi tiek ierakstīti ar pircēju, dokumentu, datumu un summu eiro.

## Ikdienā
- Ieņēmumu datums = diena, kad pasūtījums pirmo reizi saņēma apmaksātu statusu.
- Atmaksa tiek ierakstīta kā izsniegta nauda un samazina apgrozījumu.
- **+ Izdevumi / + Ieņēmumi:** manuāli ieraksti (piegādātāju rēķini, citi ieņēmumi). "Vairākas ailes" ļauj aizpildīt jebkuru aili.
- Numerācija no gada sākuma hronoloģiski; katram mēnesim - kopsummas un kopsumma no gada sākuma, sākuma un beigu atlikumi.
- **Drukāt / PDF:** oficiālā ailu izkārtojumā, katrs mēnesis savā lapā (A4 ainava).
- **CSV (Excel):** visas ailes, latviešu burti saglabāti.

## Svarīgi
Rīks palīdz kārtot žurnālu, bet neaizstāj grāmatvedi. Pārbaudiet ierakstus pirms deklarācijas iesniegšanas. Ja veikala pamatvalūta nav EUR, summas pārrēķina pēc veikala kursa - pārliecinieties, ka tas atbilst Latvijas Bankas kursam. Atinstalējot moduli, žurnāla ieraksti netiek dzēsti.
