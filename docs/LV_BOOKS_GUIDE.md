# SIA grāmatvedība (LV Books) - lietošanas instrukcija (v1.2.0)

Divkāršā ieraksta grāmatvedība Latvijas SIA tieši OpenCart administrācijā. Uztur jūsu SIA grāmatas gatavas grāmatvedim - **neaizstāj grāmatvedi**. Mazām SIA gada pārskatu parasti paraksta grāmatvedis vai valde pēc grāmatveža pārbaudes.

Modulis ir atsevišķs produkts, veidots uz "Saimnieciskās darbības žurnāla" pamata: tam ir savas tabulas (`lv_books_*`), un abus moduļus var turēt vienā veikalā.

## Uzstādīšana
- **OpenCart 3:** Extensions > Installer → `lv_books_oc3.ocmod.zip` → Extensions > Extensions > Modules → "LV grāmatvedība SIA (divkāršais ieraksts)" → Install.
- **OpenCart 4:** Extensions > Installer → `lv_books.ocmod.zip` (nemainiet faila nosaukumu) → Install → Extensions > Extensions > Modules → Install.
- Izvēlnē: **Reports > SIA grāmatvedība**.

## Pirmie soļi
1. **Uzņēmums:** ievadiet SIA reģistrācijas numuru → "Atrast" (Uzņēmumu reģistrs, VID PVN reģistrs). SIA vienmēr kārto divkāršo ierakstu un maksā UIN; MUN SIA nav pieejams.
2. **Grāmatvedība → Grāmatvedības iestatījumi:** grāmatvedības sākuma datums, finanšu gads, pamatlīdzekļu slieksnis, valdes loceklis, grāmatvedības politika.
3. **Grāmatvedība → Grāmatojumi → Sākuma atlikumi:** visu bilances kontu atlikumi sākuma datumā (no iepriekšējās bilances). Ja pārejat no "Saimnieciskās darbības žurnāla", sāciet jaunas grāmatas ar sākuma atlikumiem izvēlētajā datumā - vēsture netiek pārvērsta.
4. **Krājumi un PL → Krājumu sākuma atlikumi** (precēm, kuras pārdodat) un **Pamatlīdzekļi** (esošie, ar jau aprēķināto nolietojumu).
5. **Dalībnieki:** dalībnieki un daļas; atzīmējiet, vai tie ir fiziskas personas (15% UIN iespējai).
6. **Iestatījumi:** pasūtījumu statusi, maksājumu veidi un to komisijas (kā žurnālā), IBAN rēķiniem.

## Kā veidojas grāmatojumi
- **Pasūtījumi, atmaksas, komisijas** - automātiski, kad mainās pasūtījuma statuss (Dt nauda / Kt 6110 ieņēmumi, PVN 5721; komisija 7510).
- **Izdevumi** (Dokumenti → + Izdevumi vai 📷 no čeka foto): izvēlieties **kontu** - izdevumu konts, krājumi (2130/2110 ar preču rindām), pamatlīdzeklis (1210/1110), ar darbību nesaistīti (7580 → UIN). Dokuments citā valūtā - pārrēķins pēc Latvijas Bankas kursa.
- **Rēķini** (bez pasūtījuma) - izrakstot Dt 2310 / Kt 6110 + PVN; apmaksa dzēš pircēja parādu.
- **Krājumi** - pārdodot pasūtījumu, pašizmaksa pēc vidējās cenas (Dt 7110 / Kt 2130). Gada beigās - inventarizācija; starpība uz 7110.
- **Pamatlīdzekļi** - lineārais nolietojums katru mēnesi no nākamā mēneša pēc nodošanas lietošanā (Dt 7410 / Kt 1290 vai 1190).
- **Dividendes** - lēmums Dt 3410 / Kt 5150; izmaksa Dt 5150 / Kt nauda, UIN Dt 8610 / Kt 5710 izmaksas mēnesī; 15% gadījumā IIN 6% Kt 5710.
- **Manuāli grāmatojumi** - aizdevumi (2390, 5210), algu kopsummas no algu programmas, pārgrāmatojumi.
- Ja žurnāla dokumentā naudas un ieņēmumu/izdevumu summas nesakrīt (piem. korekcija bez naudas), starpība iet uz 2310 vai 5910, un pārbaude to parāda.

Nekas netiek dzēsts: importētie dokumenti ir aizsargāti, manuālos anulē ar iemeslu, katra izmaiņa redzama izmaiņu vēsturē.

## Pārskati
- **Apgrozījuma pārskats** (debets = kredīts), konta izdruka (klikšķis uz konta), virsgrāmata CSV.
- **Peļņas vai zaudējumu aprēķins** (pēc funkcijām, PZA2 rindas) un **bilance** (BA/BP rindas).
- **Gada pārskats** mikrosabiedrībām (UGP): veselos eiro, ar iepriekšējā gada salīdzinājumu, XML VID EDS (DokGPv1).

## PVN (cilne "PVN")
Statuss nāk no uzņēmuma profila (VID PVN reģistrs): **PVN maksātājs**, **139.2 panta reģistrācija** vai **nav PVN maksātājs**.

Katram dokumentam ir **PVN veids**. To nosaka automātiski (pircēja valsts, PVN numurs pasūtījuma papildu laukos, piemērotā likme), un to var mainīt cilnē PVN (✎) vai izdevumu redaktorā:

| Veids | Deklarācija | Grāmatojums |
|---|---|---|
| Iekšzemes piegāde 21/12/5% | 41/42/42.1 un 52/53/53.1; PVN 1 III (no 150 €) | Kt 5721 |
| Iekšzemē, PVN maksā saņēmējs | 41.1; PVN 1 III | - |
| Preces ES PVN maksātājam 0% | 45; PVN 2 kods G | - |
| Pakalpojumi ES PVN maksātājam | 48.2; PVN 2 kods P; PVN 1 III | - |
| Preču eksports 0% | 48.1 | - |
| Pakalpojumi ārpus ES | 48.2 | - |
| ES patērētājiem - OSS | nav LV deklarācijā; OSS ceturkšņa kopsavilkums | Kt 5722 |
| Atbrīvots | 49 | - |
| Iegāde iekšzemē ar PVN | 62; PVN 1 I kods A (zem 150 € - V/T) | Dt 2371 |
| Iegāde, PVN maksā saņēmējs (141.-143.4 p.) | 52 un 62; PVN 1 I kods R1-R7 | Dt 2371 / Kt 5721 |
| Preces / pakalpojumi no ES | 50 (51, 51.1), 55 (56, 56.1), 64; PVN 1 II G/P | Dt 2371 / Kt 5721 |
| Pakalpojumi no ārpus ES | 54 un 63 | Dt 2371 / Kt 5721 |
| Imports | 61; PVN 1 I kods I | Dt 2371 |

- Daļēji atskaitāms priekšnodoklis (piem. vieglais auto 50%, reprezentācija 40%) - lauks "Atskaitāmais priekšnodoklis, %"; neatskaitāmā daļa iet izmaksās.
- Atmaksa par iepriekšējā perioda pārdošanu samazina PVN 67. rindā; piegādātāja kredītrēķins - 57. rindā. 57, 65, 66 un 67 rindai var pieskaitīt summu ar roku.
- **Taksācijas periods:** ceturksnis vai mēnesis (mēnesis - ja apgrozījums > 50 000 €, ja ir piegādes ES PVN maksātājiem, un pirmos 6 mēnešus pēc reģistrācijas; modulis brīdina). Deklarācija līdz 20. datumam, samaksa līdz 23. datumam.
- **XML VID EDS (DokPVNv7):** deklarācija, PVN 1 (I, II, III daļa) un PVN 2. Atveriet to EDS un pārbaudiet pirms iesniegšanas. PVN reģistrs CSV - grāmatvedim.
- **OSS:** pārdošana ES patērētājiem virs 10 000 € gadā - galamērķa valsts PVN, ceturkšņa kopsavilkums pa valstīm un likmēm; termiņš - nākamā mēneša pēdējā diena.
- **139.2 pants** (nav PVN maksātājs, reģistrēts tikai pakalpojumiem no ārvalstīm un ES precēm): PVN 21% aprēķina no pakalpojumiem no ārvalstīm un ES precēm, grāmato izmaksās (Dt izdevumi / Kt 5721), mēneša saraksts paziņojumam par PVN samaksu (līdz nākamā mēneša 20. datumam).
- **Nav PVN maksātājs:** pārbaude brīdina, ja jāreģistrējas - pakalpojumi no ārvalstīm, pakalpojumi ES uzņēmumiem, preces no ES > 10 000 € gadā (apgrozījuma 50 000 € slieksnis - kā žurnālā).
- Rēķinos ES / apgrieztās maksāšanas darījumiem ierakstiet piezīmi "Nodokļa apgrieztā maksāšana" un pircēja PVN numuru - pārbaude to atgādina.

## Pārbaude pirms iesniegšanas VID EDS
Pirms XML faila lejupielādes modulis to pārbauda un parāda „Viss kārtībā” vai kļūdu sarakstu:
- **PVN deklarācija** – pēc VID oficiālās XML shēmas (DokPVNv7; modulis to lejupielādē no vid.gov.lv un saglabā veikalā) un pēc noteikumiem: 43. rinda, 52./55. rinda pret bāzi, PVN 1 un PVN 2 rindu pilnība, dokumenti bez PVN veida.
- **UIN deklarācija** un **gada pārskats** – pēc VID formāta apraksta un noteikumiem: rindu aprēķini, 25.1 rindas skaidrojums, bilances aktīva un pasīva sakritība, paraksttiesīgā persona.

## Termiņi un atgādinājumi
Termiņi redzami cilnē **Pārskats** un **Nodokļi**. Atgādinājumi pa e-pastu – Iestatījumi → Termiņi un atgādinājumi (dienas pirms termiņa, adrese); par katru termiņu tiek atgādināts vienreiz un vēlreiz, ja tas nokavēts. Kad deklarācija iesniegta, atzīmējiet to („Iesniegts”).

## UIN
- 20% no sadalītās peļņas: bāze = summa / 0,8 (1000 € dividendes → UIN 250 €).
- No 2026. gada, ja visi dalībnieki ir fiziskas personas: 15% (bāze = summa / 0,85) un 6% IIN ieturējums (1000 € → UIN 176 €, IIN 60 €, dalībnieks saņem 940 €). VID veidlapā vēl nav atsevišķas rindas: 1. un 4. rinda kā parasti, starpība starp 20% un 15% 25. rindā, skaidrojums 25.1 rindā ("UIN samazinājums par dividendēm saskaņā ar Uzņēmumu ienākuma nodokļa likuma 4.2 pantu"). IIN 6% maksā līdz nākamā mēneša 23. datumam un deklarē par katru personu.
- Nosacīti sadalītā peļņa: ar saimniecisko darbību nesaistītie izdevumi (7580) un soda naudas (7610) → R06_1. Aizdevumi dalībniekiem gada beigās tiek parādīti kā brīdinājums.
- Cilnē **Nodokļi**: mēneša aprēķins, XML VID EDS (DokUIENv5), termiņu kalendārs (UIN 20. datums, PVN, IIN no dividendēm, gada pārskats) ar atzīmi "iesniegts".

## Šajā versijā nav
- Algu un darba devēja VSAOI aprēķina (ierakstiet algu kopsummas no algu programmas kā grāmatojumu).
- Piegādātāju rēķinu uzkrāšanas līdz apmaksai (izdevumi tiek grāmatoti apmaksā; uzkrājumus var ievadīt ar manuālu grāmatojumu).
- Valūtas kursu starpību (pircēju un piegādātāju parādi ārvalstu valūtā) - ievadiet ar manuālu grāmatojumu (6320 / 7570).
- Importa PVN īpašās kārtības (aprēķins deklarācijā ar VID atļauju) un IOSS.

## Jāpārbauda grāmatvedim (nav pārbaudīts ar grāmatvedi)
- Kontu plāna rindu piesaiste gada pārskatam (it īpaši 5210, 5610, 2371, 5721, 8110).
- UIN 15% atspoguļojums 25. rindā un XML elementi.
- Gada pārskata termiņš konkrētajam uzņēmuma lielumam (iestatījums "Gada pārskata termiņš", noklusējums 4 mēneši).
- Reprezentācijas izdevumu un aizdevumu dalībniekiem iekļaušana UIN bāzē.
- Gada pārskata XML (DokGPv1) pirms pirmās iesniegšanas.
- PVN: PVN 1 dokumentu veida kodi (1 rēķins, 2 čeks, 5 muitas dokuments), I daļas kods "N" pakalpojumiem no ārpus ES, PVN numura rakstība bez valsts prefiksa, kredītrēķinu atspoguļojums 41. rindā un 67. rindā, OSS darījumu neiekļaušana LV deklarācijā, 139.2 paziņojuma termiņš.

Rīks palīdz kārtot grāmatvedību, bet nav juridisks vai nodokļu padoms un neko neiesniedz VID pats.
