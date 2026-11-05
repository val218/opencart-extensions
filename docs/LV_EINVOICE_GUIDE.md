# Lastadia E-invoices (E-rēķini, E-arved, E-sąskaitos) - lietošanas instrukcija (v1.1.0)

Strukturētie e-rēķini OpenCart veikalam Latvijā, Igaunijā vai Lietuvā: rēķini un kredītrēķini ar nepārtrauktu numerāciju un e-rēķina XML fails (Peppol BIS Billing 3.0 / EN 16931, UBL 2.1) katram rēķinam uzņēmumam. Bez grāmatvedības - grāmatvedību var kārtot jūsu grāmatvedis savā programmā.

*English summary below. Eestikeelne ja lietuviškas santrauka - žemiau.*

## Kāpēc
- **Latvija:** valsts un pašvaldību iestādēm e-rēķini ir obligāti jau tagad; PVN maksātājiem savā starpā - no 2028. gada 1. janvāra.
- **Igaunija:** valsts iestādēm - kopš 2019. gada; kopš 2025. gada 1. jūlija uzņēmums, kas reģistrēts kā e-rēķinu saņēmējs, var tos pieprasīt no piegādātāja. Vispārēja prasība no 2027. gada ir ierosināta, bet vēl nav pieņemta.
- **Lietuva:** valsts iestādēm - caur eSąskaita (kopš 2017. gada); PVN maksātājiem savā starpā plānoti no 2028. gada.
- Patērētājiem e-rēķins nav vajadzīgs.

## Uzstādīšana
1. OpenCart 3: Extensions → Installer → `lv_einvoice_oc3.ocmod.zip`; Extensions → Modules → "Lastadia E-invoices" → Install. OpenCart 4: Extensions → Installer → `lv_einvoice.ocmod.zip` → Install, tad Extensions → Modules → Install.
2. Izvēlne: Sales → Lastadia E-invoices.
3. Cilnē **Uzņēmums** izvēlieties valsti (Latvija, Igaunija, Lietuva) un aizpildiet uzņēmuma datus:
   - Latvija: ievadiet reģistrācijas numuru - nosaukums, adrese un PVN statuss tiek atrasti Uzņēmumu reģistrā un VID datos.
   - Igaunija un Lietuva: PVN maksātāji var atrast datus pēc PVN numura (ES VIES); citādi ievadiet paši.
   - Reģistrācijas numurs ir e-rēķina adrese: Latvijā 11 cipari (Peppol 0218), Igaunijā 8 (registrikood, 0191), Lietuvā 9 (įmonės kodas, 0200).
4. **Rēķinu valoda:** pēc noklusējuma - uzņēmuma valsts valoda (latviešu, igauņu, lietuviešu); var izvēlēties arī angļu. Jau izrakstītie rēķini paliek savā valodā.
5. Iestatījumos - konts (IBAN), rēķinu sērijas, apmaksas termiņš; vajadzības gadījumā - automātiski rēķini katram apmaksātam pasūtījumam. Moduļa valoda: latviešu, angļu, krievu, igauņu vai lietuviešu.

## Rēķini
- **+ Rēķins** - pircējs (nosaukums, reģistrācijas Nr., PVN Nr., valsts, atsauce), rindas ar daudzumu, mērvienību, cenu un PVN likmi (pēc noklusējuma - valsts pamatlikme: LV 21 %, EE 24 %, LT 21 %). PVN maksātājam, ja likme 0 %, - iemesls: apgrieztā maksāšana, preces citas ES valsts PVN maksātājam, eksports, atbrīvots; iemesls tiek drukāts uz rēķina.
- **+ Rēķins pasūtījumam** - no pasūtījuma; uzņēmuma rekvizītus (reģ. Nr., PVN Nr.) var ievadīt izrakstot.
- **Automātiski rēķini** - ja ieslēgti, katram pasūtījumam, kas apmaksāts pēc ieslēgšanas dienas.
- Izdruka: Latvijā "Rēķins", Igaunijā "Arve", Lietuvā "Sąskaita faktūra" (PVN maksātājam - "PVM sąskaita faktūra").
- Izrakstītu rēķinu nevar mainīt vai dzēst - kļūdu labo ar kredītrēķinu. Kredītrēķinā katrai PVN likmei ir sava rinda.

## E-rēķini
- Pie rēķina poga **XML** - e-rēķina fails. Ja e-rēķinu nevar sagatavot (piem. pircējam nav reģistrācijas vai PVN numura), modulis parāda iemeslu.
- Pārskatā **E-rēķini par periodu** - visi perioda e-rēķini vienā ZIP failā ar sarakstu.
- Failu nosūtiet caur e-rēķinu operatoru vai valsts pakalpojumu (Latvijā - e-adrese, Igaunijā - e-arve operators, Lietuvā - eSąskaita); modulis pats nesūta.
- Faili pārbaudīti ar oficiālajiem CEN EN 16931 un Peppol noteikumiem (bez kļūdām).
- Nav iekļauts: Lietuvas i.SAF un Igaunijas KMD INF pārskati - tos sagatavo grāmatvedības programma.

## Drošība
- Slēgtie periodi, piekļuve katram administratoram, izmaiņu vēsture, pilna datu kopija (Iestatījumi).

Rīks palīdz izrakstīt rēķinus, bet nav juridisks vai nodokļu padoms. Par rēķinu saturu atbild izrakstītājs.

---

## English
Invoices and credit notes with continuous numbering, from orders or typed in, for shops in **Latvia, Estonia and Lithuania**. Invoices are printed in Latvian, Estonian, Lithuanian or English. Every invoice to a business gets a Peppol BIS Billing 3.0 / EN 16931 XML file with the seller's and buyer's company code as the e-invoice address (Latvia 0218, Estonia 0191, Lithuania 0200, else the VAT number), checked against the official CEN and Peppol rules. Choose the country and language on the **Company** tab. Interface in Latvian, English, Russian, Estonian or Lithuanian. Not included: Lithuanian i.SAF and Estonian KMD INF reports.

## Eesti
Arved ja kreeditarved järjestikuse numeratsiooniga, tellimustest või käsitsi, poodidele Lätis, Eestis ja Leedus. Arve trükitakse eesti, läti, leedu või inglise keeles. Igale ettevõttele väljastatud arvele koostatakse Peppol BIS Billing 3.0 / EN 16931 XML-fail, e-arve aadressiks on registrikood (0191). Valige riik ja keel vahekaardil **Ettevõte**. Saatke fail e-arve operaatori kaudu; moodul ise ei saada.

## Lietuvių
Sąskaitos faktūros ir kreditinės sąskaitos su nenutrūkstama numeracija, iš užsakymų arba įvestos rankiniu būdu, parduotuvėms Latvijoje, Estijoje ir Lietuvoje. Sąskaita spausdinama lietuvių, latvių, estų arba anglų kalba. Kiekvienai įmonei išrašytai sąskaitai parengiamas Peppol BIS Billing 3.0 / EN 16931 XML failas, e. sąskaitos adresas - įmonės kodas (0200). Šalį ir kalbą pasirinkite skirtuke **Įmonė**. Siųskite failą per eSąskaita arba e. sąskaitų operatorių; modulis pats nesiunčia.
