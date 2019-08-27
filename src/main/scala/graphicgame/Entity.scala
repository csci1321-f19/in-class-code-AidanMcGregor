package graphicgame

class Entity(private var x: Double, private var y: Double) {
    val width = 1.0
    val height = 1.0

    def intersects(e: Entity): Boolean = {
        val intersectx = (x - e.x).abs < (width + e.width)/2
        val intersecty = (y - e.y).abs < (height + e.height)/2
        intersectx && intersecty
    }
}