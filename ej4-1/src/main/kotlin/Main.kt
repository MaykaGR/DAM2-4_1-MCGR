const val max = 15

class Alumnos(ID: String, Nombre: String, Ap1: String, Ap2: String) {
    val ID = ""
    val Nombre = ""
    val Apellidos = ""


}

class Modulo(
    Als: Array<Alumnos?> = arrayOfNulls(max),
    Notas: Array<DoubleArray> = Array(3, { i -> DoubleArray(15, { j -> 0.0 }) })
) {
    //Array de alumnos matriculados.
    var Als: Array<Alumnos?> = arrayOfNulls(max)

    //Array de las notas de cada alumno en cada una de las 3 evaluaciones.
    var Notas = Array(3, { i -> DoubleArray(15, { j -> 0.0 }) })

    /*override fun toString(): String {
        return Als.
    }*/
    companion object {
        const val Primera = "0"
        const val Segunda = "1"
        const val Tercera = "2"
    }
    //Esta función calcula la media para saber la nota final de cada alumno, en i hay que incluir el índice que
    //el alumno tiene en el array de alumnos para que se calcule su media.
    fun calculaEvaluacionFinal(Notas: Array<DoubleArray>, i: Int): Double {
        // Media hecha con las posiciones de array=Notas[0][i]+[1][i]+[2][i] /3
        var a = Notas[0][i]
        var b = Notas[1][i]
        var c = Notas[2][i]
        var media: Double = (a + b + c) / 3
        return media ?: 0.0

    }

    fun matricularAlumno (al: Alumnos, Als: Array<Alumnos>):Boolean{
        var counter = 0
        while (Als[counter] !== null){
            counter=+1
        }
        if (Als[counter] == null){
            Als[counter] = al
            return true
        } else return false
    }

    fun bajaAlumno (ID: String): Boolean {
        var local = Als.indexOfFirst{it?.ID==ID}
        Als[local]= null
        return true
    }
    fun establecerNota(ID: String, evaluacion: String, nota: Float): Boolean {
        var Pos = Als.indexOfFirst{it?.ID==ID}
        Notas[evaluacion.toInt()][Pos]
        return true
    }
    //fun notaMasBaja(evaluacion:String): Float{}
    //fun notaMasAlta(evaluacion:String): Float{}
    //fun notaMedia(evaluacion:String): Float
    //fun listaNotas(evaluacion:String): List<Pair>
    //fun numeroAprobados(evaluacion:String): Int
    //fun hayAlumnosConDiez(evaluacion:String): Boolean
    //fun hayAlumnosAprobados(evaluacion:String): Boolean
    //fun primeraNotaNoAprobada(evaluacion:String): Float
    //fun listaNotasOrdenados(evaluacion:String): List<Pair>
}
fun main(){
    val pepe = Alumnos("0", "Pepe", "Pérez", "Gómez")
    val flora = Alumnos("1", "Flora", "Papa", "Mar")
    val juanito = Alumnos("2", "Juanito", "Pijoihj", "Ghjhbjh")
    val margarita = Alumnos("3", "Margarita", "Onkj", "Uujhbvhj")
    val florinda = Alumnos("4", "Florinda", "Pérez", "Gómez")
    val paquito = Alumnos("5", "Paquito", "Pérez", "Gómez")
    val paripan = Alumnos("6", "Paripan", "Pérez", "Gómez")
    val villuela = Alumnos("7", "Villuela", "Pérez", "Gómez")
    val marta = Alumnos("8", "Marta", "Pérez","Gómez")
    val fran = Alumnos("9", "Fran", "Pérez", "Gómez")
    var unModulo = Modulo()
}