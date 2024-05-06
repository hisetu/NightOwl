package app.lucascoffe.nightowl.data.remote.model

import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName


class SubregionResponse : ArrayList<SubregionResponse.SubregionItem>() {
    @Serializable
    data class SubregionItem(
        @SerialName("flags")
        val flags: Flags,
        @SerialName("name")
        val name: Name,
        @SerialName("subregion")
        val subregion: String
    ) {
        @Serializable
        data class Flags(
            @SerialName("alt")
            val alt: String,
            @SerialName("png")
            val png: String,
            @SerialName("svg")
            val svg: String
        )

        @Serializable
        data class Name(
            @SerialName("common")
            val common: String,
            @SerialName("nativeName")
            val nativeName: NativeName,
            @SerialName("official")
            val official: String
        ) {
            @Serializable
            data class NativeName(
                @SerialName("ara")
                val ara: Ara,
                @SerialName("arc")
                val arc: Arc,
                @SerialName("aze")
                val aze: Aze,
                @SerialName("ben")
                val ben: Ben,
                @SerialName("ckb")
                val ckb: Ckb,
                @SerialName("div")
                val div: Div,
                @SerialName("dzo")
                val dzo: Dzo,
                @SerialName("eng")
                val eng: Eng,
                @SerialName("fas")
                val fas: Fas,
                @SerialName("fil")
                val fil: Fil,
                @SerialName("fra")
                val fra: Fra,
                @SerialName("heb")
                val heb: Heb,
                @SerialName("hin")
                val hin: Hin,
                @SerialName("hye")
                val hye: Hye,
                @SerialName("ind")
                val ind: Ind,
                @SerialName("jpn")
                val jpn: Jpn,
                @SerialName("kat")
                val kat: Kat,
                @SerialName("kaz")
                val kaz: Kaz,
                @SerialName("khm")
                val khm: Khm,
                @SerialName("kir")
                val kir: Kir,
                @SerialName("kor")
                val kor: Kor,
                @SerialName("lao")
                val lao: Lao,
                @SerialName("mon")
                val mon: Mon,
                @SerialName("msa")
                val msa: Msa,
                @SerialName("mya")
                val mya: Mya,
                @SerialName("nep")
                val nep: Nep,
                @SerialName("por")
                val por: Por,
                @SerialName("prs")
                val prs: Prs,
                @SerialName("pus")
                val pus: Pus,
                @SerialName("rus")
                val rus: Rus,
                @SerialName("sin")
                val sin: Sin,
                @SerialName("tam")
                val tam: Tam,
                @SerialName("tet")
                val tet: Tet,
                @SerialName("tgk")
                val tgk: Tgk,
                @SerialName("tha")
                val tha: Tha,
                @SerialName("tuk")
                val tuk: Tuk,
                @SerialName("tur")
                val tur: Tur,
                @SerialName("urd")
                val urd: Urd,
                @SerialName("uzb")
                val uzb: Uzb,
                @SerialName("vie")
                val vie: Vie,
                @SerialName("zho")
                val zho: Zho
            ) {
                @Serializable
                data class Ara(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Arc(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Aze(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Ben(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Ckb(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Div(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Dzo(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Eng(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Fas(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Fil(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Fra(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Heb(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Hin(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Hye(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Ind(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Jpn(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Kat(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Kaz(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Khm(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Kir(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Kor(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Lao(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Mon(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Msa(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Mya(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Nep(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Por(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Prs(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Pus(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Rus(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Sin(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Tam(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Tet(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Tgk(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Tha(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Tuk(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Tur(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Urd(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Uzb(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Vie(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )

                @Serializable
                data class Zho(
                    @SerialName("common")
                    val common: String,
                    @SerialName("official")
                    val official: String
                )
            }
        }
    }
}