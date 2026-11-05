[b]Demonstrācija un ekrānuzņēmumi:[/b] https://val218.github.io/opencart-extensions/lv-books.html
[b]Ievadcena[/b] – spēkā līdz neatkarīga grāmatveža pārbaudes pabeigšanai.

[b]SIA grāmatvedība – divkāršā ieraksta grāmatvedība tieši OpenCart administrācijā[/b]
[b]Kam paredzēts:[/b] SIA un mikrosabiedrībām – PVN maksātājiem un PVN nemaksātājiem, kas pārdod preces vai pakalpojumus OpenCart interneta veikalā.
[b]Nav paredzēts individuālajiem komersantiem (IK) un pašnodarbinātajiem[/b] – viņiem piemērots vienkāršā ieraksta modulis „Saimnieciskās darbības žurnāls”: https://www.opencart.com/index.php?route=marketplace/extension/info&extension_id=50265

Modulis uztur SIA grāmatvedību kārtībā un gatavu nodošanai grāmatvedim. Tas neaizstāj grāmatvedi un neko neiesniedz VID: tas sagatavo skaitļus un XML failus, kurus jūs pārbaudāt un iesniedzat paši.

[b]Grāmatvedība[/b]
[list]
[*][b]Automātiski grāmatojumi[/b] – apmaksātie pasūtījumi, atmaksas un maksājumu pakalpojumu komisijas tiek iegrāmatotas, tiklīdz mainās pasūtījuma statuss.
[*][b]Izdevumi ar kontu[/b] – izmaksas, krājumi (ar preču rindām), pamatlīdzekļi, ar saimniecisko darbību nesaistītie izdevumi (UIN bāzei).
[*]Sākuma atlikumi, aizdevumi un citi manuāli grāmatojumi, atkārtoti ikmēneša grāmatojumi (noma, abonementi); kontu plāns mazai SIA, ko var papildināt.
[*]Apgrozījuma pārskats, konta izdruka, virsgrāmata (CSV) un [b]naudas plūsmas pārskats[/b] (tiešā metode).
[*][b]„Ko darīt tagad”[/b] – pārskatā redzami nokavētie un tuvākie termiņi, neapmaksātie rēķini, neaprēķinātās algas; [b]iestatīšanas vednis[/b] ar uzņēmuma datiem no reģistriem.
[*][b]Nekas netiek dzēsts[/b] – anulēšana tikai ar iemeslu; izmaiņu vēsture: kas, kad, no kuras IP adreses, vērtība pirms un pēc.
[/list]

[b]Dokumenti: čeku un rēķinu foto, rēķini, CMR[/b]
[list]
[*][b]Izdevumi no čeka vai rēķina foto (arī PDF)[/b] – teksts tiek nolasīts pārlūkprogrammā (attēls netiek sūtīts uz internetu); piegādātājs, PVN numurs, datums, summa un PVN aizpildās automātiski. Fails tiek saglabāts kā attaisnojuma dokuments – atliek izvēlēties kontu un PVN veidu.
[*][b]Rēķini un kredītrēķini[/b] ar nepārtrauktu numerāciju, nosūtīšana pircējam pa e-pastu; saņemtā apmaksa dzēš pircēja parādu.
[*][b]CMR pavadzīmes[/b] – izejošās un ienākošās, piesaistītas rēķiniem; izdruka ar 24 ailēm un kravas saņemšanas atzīme.
[*][b]Strukturētie e-rēķini[/b] (Peppol BIS Billing 3.0 / EN 16931, UBL XML) katram rēķinam un kredītrēķinam uzņēmumam – valsts iestādēm obligāti jau tagad, PVN maksātājiem savā starpā no 2028. gada 1. janvāra. Pārbaudīti ar oficiālajiem CEN un Peppol noteikumiem.
[*]Uzņēmuma dati no Uzņēmumu reģistra un VID PVN maksātāju reģistra.
[/list]

[b]Norēķini un banka[/b]
[list]
[*][b]Piegādātāju rēķini[/b] – iegrāmatoti saņemšanas dienā (izmaksas, krājumi, pamatlīdzekļi, PVN), apmaksa arī pa daļām; viena piegādātāja rēķina numuru nevar ievadīt divreiz.
[*][b]Neapmaksātie rēķini[/b] pircējiem un piegādātājiem ar novecošanu (līdz 30, 60, 90, virs 90 dienām) un [b]savstarpējo norēķinu salīdzināšanas akts[/b].
[*][b]Konta izraksts (camt.053)[/b] – rindas, kuru nav grāmatvedībā, ieraksta uzreiz: rēķina apmaksa, piegādātāja rēķina apmaksa vai pēc noteikuma (piem. „Komisija → 7510”).
[/list]

[b]Algas[/b]
[list]
[*]Darbinieki, mēneša algu aprēķins ar 2026. gada likmēm: VSAOI (darba ņēmējs, pensionārs, izdienas pensijas saņēmējs), IIN 25,5 % ar neapliekamo minimumu, apgādājamiem un atvieglojumiem, uzņēmējdarbības riska nodeva.
[*][b]Atvaļinājuma nauda[/b] pēc vidējās izpeļņas (pēdējie 6 mēneši) un [b]slimības nauda[/b] (A lapa: 2.–3. diena 75 %, 4.–9. diena 80 %).
[*]Algas lapiņas, izmaksa, darba devēja ziņojuma dati (personas kods, ienākumi, iemaksas, IIN, stundas) un termiņi. Virsgrāmatā – tikai kopsummas; algas redz tikai lietotāji ar pilnu piekļuvi.
[/list]

[b]PVN[/b]
[list]
[*]Katram dokumentam tiek noteikts [b]PVN darījuma veids[/b] pēc pircēja valsts, ES PVN numura un likmes: iekšzemes piegāde (21 %, 12 %, 5 %), preces un pakalpojumi citu ES valstu PVN maksātājiem (0 % / apgrieztā maksāšana), eksports, pakalpojumi ārpus ES, OSS pārdošana ES patērētājiem, neapliekami darījumi.
[*]Iegādes: priekšnodoklis, apgrieztā maksāšana par pakalpojumiem no ES (Google, Meta, mitināšana) un no valstīm ārpus ES, preces no ES, iekšzemes apgrieztā maksāšana (būvniecība u. c.), imports, daļēji atskaitāms PVN (vieglajam automobilim – 50 %).
[*][b]PVN deklarācija[/b] (40.–80. rinda), PVN 1 pārskats (I, II un III daļa) un PVN 2 pārskats, XML fails VID EDS (DokPVNv7); taksācijas periods – mēnesis vai ceturksnis.
[*]OSS ceturkšņa kopsavilkums pa valstīm un likmēm.
[*]PVN nemaksātājiem: reģistrācija 139.2 panta kārtībā un brīdinājums, kad reģistrācija PVN maksātāju reģistrā kļūst obligāta.
[/list]

[b]Krājumi, pamatlīdzekļi, peļņa un UIN[/b]
[list]
[*]Krājumi pēc vidējās svērtās cenas – pašizmaksa katram pasūtījumam, inventarizācija gada beigās.
[*]Pamatlīdzekļu reģistrs ar lineāro nolietojumu katru mēnesi.
[*]Peļņas vai zaudējumu aprēķins un bilance pēc gada pārskata posteņiem; gada pārskats mikrosabiedrībām ar XML failu VID EDS.
[*]Dividendes ar UIN 20 % vai 15 % un IIN 6 % (no 2026. gada, ja visi dalībnieki ir fiziskas personas); UIN deklarācijas XML fails.
[*]Termiņu kalendārs un e-pasta atgādinājumi: UIN, PVN, OSS, darba devēja ziņojums, IIN no dividendēm, gada pārskats.
[/list]

[b]Drošība un grāmatvedis[/b]
[list]
[*][b]Slēgtie periodi[/b] – pēc deklarāciju iesniegšanas periodu slēdz; atvērt var tikai ar iemeslu un OpenCart paroli.
[*][b]Piekļuve katram administratoram[/b]: pilna, tikai skatīt vai nav piekļuves.
[*][b]Programmatūras lietošanas tiesību apliecinājums[/b] (MK noteikumi Nr. 877, 56.–59. punkts) un licences līgums – izdrukai grāmatvedības organizācijas dokumentiem.
[*][b]Dati grāmatvedim[/b] – viens ZIP fails gadam: virsgrāmata, apgrozījuma pārskats, kontu plāns, PVN reģistri, piegādātāju rēķini, algas (CSV – atveras Excel, importējami Jumis, Horizon, Zalktis, 1C), rēķini, e-rēķini un čeku attēli. Pilna datu kopija JSON formātā.
[/list]

[b]Šajā versijā nav:[/b] e-rēķinu nosūtīšanas tieši uz e-adresi (XML failu nosūtiet caur e-adresi vai e-rēķinu pakalpojumu), darba devēja ziņojuma XML faila (dati ir tabulā un CSV), valūtas kursu starpību, IOSS.

[b]E-rēķini iekļauti[/b] – strukturētie e-rēķini (Peppol / EN 16931) jau ir šajā modulī. Ja vajag tikai e-rēķinus bez grāmatvedības, ir atsevišķs modulis „Lastadia E-rēķini”: https://www.opencart.com/index.php?route=marketplace/extension/info&extension_id=50285

[b]Tehniskā informācija[/b]
[list]
[*]OpenCart 3.0.x un 4.0.x / 4.1.x (pārbaudīts 3.0.4.0, 4.0.2.3, 4.1.0.3, 4.1.0.4) – divi ZIP faili, viens pirkums.
[*]Darbojas ar notikumiem (events), bez OCMOD; OpenCart faili netiek mainīti. Atsevišķas datubāzes tabulas – var darboties vienā veikalā ar „Saimnieciskās darbības žurnālu”.
[*]Saskarne latviešu, angļu vai krievu valodā; oficiālās izdrukas – latviešu valodā.
[/list]

[b]Grāmatvežiem[/b]
Bezmaksas licence profesionālai pārbaudei. Ja esat grāmatvedis un vēlaties izvērtēt moduli, sazinieties ar izstrādātāju.

[b]English[/b]
Double-entry bookkeeping for Latvian limited companies (SIA) and micro companies, VAT payers and non-VAT payers, inside OpenCart. Not for individual merchants (IK) or self-employed people – they use the LV journal. Postings from paid orders, refunds and fees; expenses from receipt and invoice photos read in the browser; invoices, credit notes, Peppol e-invoices and CMR notes; supplier invoices, open items and balance confirmations; payroll with holiday and sick pay; cash flow statement; closed periods, per-user access and a ZIP package for the accountant; VAT treatment per document with the VAT return, PVN 1, PVN 2 and OSS; stock at average cost; fixed assets; dividends with corporate income tax 20 % or 15 %; profit and loss account, balance sheet, annual report and XML files for VID EDS.

[b]Svarīgi[/b]
Modulis palīdz kārtot grāmatvedību, taču tas nav juridisks vai nodokļu konsultants, un to vēl nav pārbaudījis sertificēts grāmatvedis. Pirms deklarāciju iesniegšanas pārbaudiet skaitļus kopā ar savu grāmatvedi. Lietošanas instrukcija: https://val218.github.io/opencart-extensions/docs/LV_BOOKS_GUIDE.md
