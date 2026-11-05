[b]Demonstrācija, ekrānuzņēmumi un video:[/b] https://val218.github.io/opencart-extensions/lv-journal.html
[b]Ievadcena[/b] – spēkā līdz neatkarīga grāmatveža pārbaudes pabeigšanai.

[b]Saimnieciskās darbības žurnāls – ieņēmumu un izdevumu uzskaite (MK noteikumi Nr. 322) tieši OpenCart administrācijā[/b]
[b]Kam paredzēts:[/b] individuālajiem komersantiem (IK) un pašnodarbinātajiem, kas kārto uzskaiti vienkāršā ieraksta sistēmā – IIN vai MUN maksātājiem, PVN maksātājiem un PVN nemaksātājiem.
[b]Nav paredzēts SIA[/b] – sabiedrībai ar ierobežotu atbildību jākārto divkāršā ieraksta grāmatvedība. SIA izmantojiet moduli „SIA grāmatvedība”: https://www.opencart.com/index.php?route=marketplace/extension/info&extension_id=50284

Apmaksātie pasūtījumi automātiski kļūst par žurnāla ierakstiem, tiklīdz mainās pasūtījuma statuss. Saskarne latviešu, angļu vai krievu valodā; oficiālās izdrukas vienmēr latviešu valodā.

[b]Žurnāls[/b]
[list]
[*][b]Automātiski ieraksti[/b] – apmaksātie pasūtījumi, pilnas un daļējas atmaksas un maksājumu pakalpojumu komisijas.
[*][b]Visas ailes[/b] – kase, maksājumu konts, citi maksāšanas līdzekļi, ieņēmumi pa veidiem, izdevumi; PVN atsevišķi.
[*][b]1., 2. un 3. pielikums[/b] – IIN maksātājiem (24 ailes), MUN maksātājiem (15 ailes) un izdevumu precizēšanas reģistrs.
[*][b]Ārvalstu valūta[/b] – pārrēķins pēc Latvijas Bankas (ECB) kursa darījuma dienas sākumā (14. punkts); valūtas pārrēķins arī izdevumu ievadē.
[*][b]Izdrukas un eksports[/b] – drukāšana un PDF oficiālajā formā; [b]dati grāmatvedim[/b] – viens ZIP fails gadam ar žurnālu, grāmatojumiem (CSV), rēķiniem, e-rēķiniem un čeku attēliem.
[*][b]„Ko darīt tagad”[/b] – pārskatā redzami nokavētie un tuvākie termiņi un neapmaksātie rēķini; [b]iestatīšanas vednis[/b] ar datiem no reģistriem.
[/list]

[b]Nekas netiek dzēsts[/b]
[list]
[*]Importētie ieraksti ir aizsargāti – tos labo ar korekcijas ierakstu.
[*]Manuālos ierakstus anulē ar iemeslu; tie paliek žurnālā pārsvītroti.
[*]Izmaiņu vēsture: kas, kad, no kuras IP adreses, vērtība pirms un pēc.
[/list]

[b]Rēķini, dokumenti, CMR[/b]
[list]
[*][b]Rēķini[/b] ar nepārtrauktu numerāciju (R-2026-00001), arī automātiski katram apmaksātam pasūtījumam, nosūtīšana pircējam pa e-pastu; [b]kredītrēķini[/b] pie atmaksām, piesaistīti sākotnējam rēķinam.
[*][b]Strukturētie e-rēķini[/b] (Peppol BIS Billing 3.0 / EN 16931, UBL XML) rēķiniem uzņēmumiem – valsts iestādēm obligāti jau tagad, PVN maksātājiem savā starpā no 2028. gada 1. janvāra. Pārbaudīti ar oficiālajiem CEN un Peppol noteikumiem.
[*][b]Izdevumi no čeka vai rēķina foto[/b] – teksts tiek nolasīts pārlūkprogrammā (attēls netiek sūtīts uz internetu), lauki aizpildās automātiski; fails tiek saglabāts kā attaisnojuma dokuments aizsargātā mapē.
[*][b]CMR pavadzīmes[/b] – izejošās (aizpildītas no rēķina vai pasūtījuma, ar bruto svaru) un ienākošās (ar skenētu dokumentu), piesaistītas rēķiniem un ierakstiem; izdruka ar 24 ailēm trijos eksemplāros un kravas saņemšanas atzīme.
[/list]

[b]Uzņēmuma dati no reģistriem[/b]
[list]
[*]Ievadiet reģistrācijas numuru – nosaukums, juridiskā forma, adrese un PVN statuss tiek iegūti no Uzņēmumu reģistra un VID PVN maksātāju reģistra (data.gov.lv); ES PVN numuri tiek pārbaudīti VIES sistēmā.
[*]Modulis pats nosaka uzskaites sistēmu, nodokļu režīmu (IIN vai MUN), PVN pienākumus un sliekšņus (50 000 €, ES OSS 10 000 €, preču iegāde no ES 10 000 €, pakalpojumi no ārvalstīm) – ar saiti uz tiesību aktu pie katra secinājuma.
[*]PVN statuss tiek pārbaudīts reizi nedēļā; ja tas mainās, modulis brīdina.
[/list]

[b]Drošība un termiņi[/b]
[list]
[*][b]Slēgtie periodi[/b] (atvērt tikai ar iemeslu un OpenCart paroli), [b]piekļuve katram administratoram[/b] (pilna, tikai skatīt, nav), pilna datu kopija.
[*]Termiņu kalendārs un e-pasta atgādinājumi: gada ienākumu deklarācija, VSAOI, MUN, PVN.
[*][b]Programmatūras lietošanas tiesību apliecinājums[/b] (MK noteikumi Nr. 877, 56.–59. punkts) un licences līgums – izdrukai grāmatvedības organizācijas dokumentiem.
[/list]

[b]Pārbaudes[/b]
[list]
[*]Trūkstoši pasūtījumi un atmaksas, sākuma atlikumi, konta izraksta (camt.053) salīdzināšana (12. punkts), izdevumi bez attaisnojuma dokumenta, CMR bez saņemšanas atzīmes.
[/list]

[b]E-rēķini iekļauti[/b] – strukturētie e-rēķini (Peppol / EN 16931) jau ir šajā modulī. Ja vajag tikai e-rēķinus bez grāmatvedības, ir atsevišķs modulis „Lastadia E-rēķini”: https://www.opencart.com/index.php?route=marketplace/extension/info&extension_id=50285

[b]Tehniskā informācija[/b]
[list]
[*]OpenCart 3.0.x un 4.0.x / 4.1.x (pārbaudīts 3.0.4.0, 4.0.2.3, 4.1.0.3, 4.1.0.4) – divi ZIP faili, viens pirkums.
[*]Darbojas ar notikumiem (events), bez OCMOD; OpenCart faili netiek mainīti. Atinstalējot ieraksti saglabājas.
[*]Datu iegūšanai no reģistriem veikala serverim jāpiekļūst data.gov.lv un ec.europa.eu; pretējā gadījumā datus var ievadīt manuāli.
[/list]

[b]Grāmatvežiem[/b]
Bezmaksas licence profesionālai pārbaudei. Ja esat grāmatvedis un vēlaties izvērtēt moduli, sazinieties ar izstrādātāju.

[b]English[/b]
For individual merchants (IK) and self-employed people in Latvia – not for limited companies (SIA use LV Books). Income and expense journal (Regulation No. 322, Annexes 1–3) filled in automatically from paid orders, refunds and payment fees, with a locked audit trail, invoices and credit notes with continuous numbering, Peppol e-invoices (EN 16931), a ZIP package for the accountant, closed periods and per-user access, deadline reminders, expenses read from receipt photos in the browser, CMR consignment notes, bank statement (camt.053) matching, Bank of Latvia exchange rates and a company profile from the Latvian registers. Interface in Latvian, English and Russian.

[b]Svarīgi[/b]
Modulis palīdz kārtot uzskaiti, taču tas nav juridisks vai nodokļu konsultants un neiesniedz dokumentus VID. Pirms deklarāciju iesniegšanas pārbaudiet ierakstus kopā ar savu grāmatvedi. Lietošanas instrukcija: https://val218.github.io/opencart-extensions/docs/LV_JOURNAL_GUIDE.md
