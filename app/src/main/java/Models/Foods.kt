package Models

class Foods {
    var name:String? = null
    var ingredients:String? = null
    var preparationOrder:String? = null

    constructor(name: String?, ingredients: String?, preparationOrder: String?) {
        this.name = name
        this.ingredients = ingredients
        this.preparationOrder = preparationOrder
    }
}