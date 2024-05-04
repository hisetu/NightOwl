package app.lucascoffe.nightowl.data.model

data class Region(val id: Int, val name: String) {
    override fun toString(): String = name
}
