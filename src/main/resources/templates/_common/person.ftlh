[#ftl]
<div class="container">
    <div class="person-info">
        <div class="photo-border"></div>
        <img src="https://thispersondoesnotexist.com/" class="photo" alt="profilové foto"/>
        <div class="row">
            <span class="label">Jméno</span>
            <span class="value">${person.firstName}</span>
        </div>
        <div class="row">
            <span class="label">Příjmení</span>
            <span class="value">${person.lastName}</span>
        </div>
        <div class="row">
            <span class="label">Datum narození</span>
            <span class="value">${person.birthDate?date}</span>
        </div>
        <div class="row">
            <span class="label">Věk</span>
            <span class="value">${person.age}</span>
        </div>
    </div>
    <div class="address">
        <div class="address-line">${person.address.street}</div>
        <div class="address-line">${person.address.zipCode}</div>
        <div class="address-line">${person.address.city}</div>
            <span class = "label">${(person.age < 65 )?string("Jsem plný elánu:)","Už jsem starej na tyhle srandy.")}</span>
    </div>
</div>