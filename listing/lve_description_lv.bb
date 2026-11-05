[b]Lastadia E-rēķini – strukturētie e-rēķini (Peppol BIS Billing 3.0 / EN 16931) tieši OpenCart administrācijā[/b]
[b]Ievadcena[/b]

[b]Kam paredzēts:[/b] Latvijas interneta veikaliem, kas pārdod uzņēmumiem vai valsts un pašvaldību iestādēm – arī tad, ja grāmatvedību kārto grāmatvedis savā programmā (Jumis, Horizon u. c.).
[b]Kāpēc tagad:[/b] valsts un pašvaldību iestādēm e-rēķini ir obligāti jau tagad; PVN maksātājiem savā starpā Latvijā – no 2028. gada 1. janvāra.

[b]Rēķini[/b]
[list]
[*]Rēķini un kredītrēķini ar nepārtrauktu numerāciju (R-2026-00001), izdruka un PDF, nosūtīšana pircējam pa e-pastu.
[*]Rēķins pasūtījumam – ar pircēja uzņēmuma rekvizītiem (reģ. Nr., PVN Nr.); pēc izvēles automātiski katram apmaksātam pasūtījumam (no ieslēgšanas dienas, bez atpakaļejošiem rēķiniem).
[*]Rēķins bez pasūtījuma (pakalpojumi, B2B pārdošana) – rindas ar daudzumu, mērvienību, cenu un PVN likmi; PVN 0 % iemesls: apgrieztā maksāšana, preces citas ES valsts PVN maksātājam, eksports, atbrīvots.
[*]Izrakstītu rēķinu nevar mainīt vai dzēst – kļūdu labo ar kredītrēķinu. Izmaiņu vēsture, slēgtie periodi, piekļuve katram administratoram.
[/list]

[b]E-rēķini[/b]
[list]
[*]Katram rēķinam un kredītrēķinam uzņēmumam – XML fails Peppol BIS Billing 3.0 / EN 16931 (UBL 2.1) formātā: adresāts pēc reģistrācijas numura (0218) vai PVN numura, PVN kategorijas, apmaksas konts.
[*][b]Pārbaudīts ar oficiālajiem CEN EN 16931 un Peppol noteikumiem[/b] – bez kļūdām.
[*]Ja e-rēķinu nevar sagatavot (piem. pircējam nav reģistrācijas vai PVN numura), modulis parāda iemeslu.
[*][b]E-rēķini par periodu[/b] – viens ZIP fails ar sarakstu grāmatvedim vai e-rēķinu pakalpojumam.
[*]Failu nosūtiet caur valsts e-adresi vai e-rēķinu pakalpojuma sniedzēju (modulis pats nesūta).
[/list]

[b]Uzņēmuma dati no reģistriem[/b]
[list]
[*]Ievadiet reģistrācijas numuru – nosaukums, adrese un PVN statuss no Uzņēmumu reģistra un VID PVN maksātāju reģistra; ES PVN numuri – VIES.
[/list]

[b]Pilna grāmatvedība[/b]
Ja vajag arī grāmatvedību, e-rēķini jau ir iekļauti moduļos „SIA grāmatvedība” (https://www.opencart.com/index.php?route=marketplace/extension/info&extension_id=50284) un „Saimnieciskās darbības žurnāls” (https://www.opencart.com/index.php?route=marketplace/extension/info&extension_id=50265) – šo moduli tad atsevišķi pirkt nevajag.

[b]Tehniskā informācija[/b]
[list]
[*]OpenCart 3.0.x un 4.0.x / 4.1.x (pārbaudīts 3.0.4.0, 4.0.2.3, 4.1.0.3, 4.1.0.4) – divi ZIP faili, viens pirkums.
[*]Darbojas ar notikumiem (events), bez OCMOD; OpenCart faili netiek mainīti; atsevišķas datubāzes tabulas.
[*]Saskarne latviešu, angļu vai krievu valodā; rēķini latviešu valodā.
[/list]

[b]English[/b]
Structured e-invoices for Latvian OpenCart shops. Invoices and credit notes with continuous numbering, made from orders automatically, by hand, or typed in. Peppol BIS Billing 3.0 / EN 16931 UBL XML for every invoice to a business, checked against the official CEN and Peppol rules. A ZIP with all e-invoices of a period for the accountant. Company data comes from the Latvian registers. Required for public bodies now and between VAT payers in Latvia from 1 January 2028. Interface in Latvian, English and Russian.

[b]Svarīgi[/b]
Modulis palīdz izrakstīt rēķinus un e-rēķinus, bet nav juridisks vai nodokļu padoms. Par rēķinu saturu atbild izrakstītājs. Lietošanas instrukcija: https://val218.github.io/opencart-extensions/docs/LV_EINVOICE_GUIDE.md
