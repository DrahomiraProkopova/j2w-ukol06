[#ftl]
[@c.page]
    <div class="seznam">

        [#list vizitky as vizitka]
            <a href="/detail/${vizitka.id}">
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
            </a>
        [/#list]


        <a href="/nova">
            <div class="vizitka vizitka--nova">
                <svg width="100" height="100">
                    <rect width="20" height="100" x="40" y="0" fill="white"/>
                    <rect width="100" height="20" x="0" y="40" fill="white"/>
                </svg>
            </div>
        </a>
    </div>
[/@c.page]
