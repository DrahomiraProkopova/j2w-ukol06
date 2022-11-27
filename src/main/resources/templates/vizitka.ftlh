[#ftl]
[@c.page]
    <div class="detail">
        <div class="vizitka">
            [#if vizitka.celeJmeno?has_content]
                <div class="jmeno">${vizitka.celeJmeno}</div>
            [/#if]
            [#if vizitka.firma?has_content]
                <div class="firma">${vizitka.firma}</div>
            [/#if]
            <div class="udaje">
                [#if vizitka.celaAdresa?has_content]
                    <div class="adresa">
                        <div>${vizitka.celaAdresa}</div>
                    </div>
                [/#if]
                <div class="kontakty">
                    [#if vizitka.email?has_content]
                        <div><i class="las la-at"></i> <span>${vizitka.email}</span></div>
                    [/#if]
                    [#if vizitka.telefon?has_content]
                        <div><i class="las la-phone-alt"></i> <span>${vizitka.telefon}</span></div>
                    [/#if]
                    [#if vizitka.web?has_content]
                        <div><i class="las la-globe"></i> <span>${vizitka.web}</span></div>
                    [/#if]
                </div>
            </div>
        </div>

        <div class="mapa">
            <iframe style="border:none" src="https://frame.mapy.cz/?q=${vizitka.celaAdresa?url}" width="100%" height="100%"
                    frameborder="0"></iframe>
        </div>

        [@c.back /]
    </div>
[/@c.page]
