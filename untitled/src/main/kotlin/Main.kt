const val max = 15
class Alumnos(ID: Int,Nombre: String,Apellidos: String) {
    val ID = 0
    val Nombre = ""
    val Apellidos = ""

}
class Modulo(Als:Array<Alumnos?> = arrayOfNulls(max), Notas: Array<DoubleArray> = Array(3,{i -> DoubleArray(15,{j -> 0.0})})){
    //Array de alumnos matriculados.
    var Als: Array<Alumnos?> = arrayOfNulls(max)
    //Array de las notas de cada alumno en cada una de las 3 evaluaciones.
    var Notas = Array(3,{i -> DoubleArray(15,{j -> 0.0})})
    /*override fun toString(): String {
        return Als.
    }*/
    //Esta función calcula la media para saber la nota final de cada alumno, en i hay que incluir el índice que
    //el alumno tiene en el array de alumnos para que se calcule su media.
 fun media (Notas:Array<DoubleArray>,i: Int): Double {
     // Media hecha con las posiciones de array=Notas[0][i]+[1][i]+[2][i] /3
        var a=Notas[0][i]
        var b=Notas[1][i]
        var c=Notas[2][i]
        var media:Double =(a+b+c)/3
       return media ?:0.0


 }
}

fun main() {
    //var Notas:Array<Int>[15][3]
    //var Notas = Array(3,{FloatArray(15)})
    /* var Notas: Array<IntArray> = arrayOf(
    intArrayOf()
    intArrayOf()
    )
     */
    val pepe = Alumnos(1,"Pepe","Pérez Gómez")
    val flora = Alumnos(2,"Flora","Papa Mar")
    val juanito = Alumnos(3,"Juanito","Pijoihj Ghjhbjh")
    val margarita = Alumnos(4,"Margarita","Onkj Uujhbvhj")
    val florinda = Alumnos(5,"Florinda","Pérez Gómez")
    val paquito = Alumnos(6,"Paquito","Pérez Gómez")
    val paripan = Alumnos(7,"Paripan","Pérez Gómez")
    val villuela = Alumnos(8,"Villuela","Pérez Gómez")
    val marta = Alumnos(9,"Marta","Pérez Gómez")
    val fran = Alumnos(10,"Fran","Pérez Gómez")
    var Matri = Modulo()
    Matri.Als[0]=pepe
    Matri.Als[1]=flora
    Matri.Als[2]=juanito
    Matri.Als[3]=margarita
    Matri.Als[4]=florinda
    Matri.Als[5]=paquito
    Matri.Als[6]=paripan
    Matri.Als[7]=villuela
    Matri.Als[8]=marta
    Matri.Als[9]=fran
    Matri.Notas [0][0] = 8.5
    Matri.Notas [1][0] = 7.0
    Matri.Notas [2][0] = 4.3
    print ("La nota final de Pepe es:")
    println (Matri.media(Matri.Notas,0))
    Matri.Notas [0][1] = 6.5
    Matri.Notas [1][1] = 4.8
    Matri.Notas [2][1] = 9.2
    print ("La nota final de Flora es:")
    println (Matri.media(Matri.Notas,1))
    Matri.Notas [0][2] = 4.5
    Matri.Notas [1][2] = 6.4
    Matri.Notas [2][2] = 5.4
    print ("La nota final de Juanito es:")
    println (Matri.media(Matri.Notas,2))
    Matri.Notas [0][3] = 5.7
    Matri.Notas [1][3] = 2.5
    Matri.Notas [2][3] = 1.6
    Matri.Notas [0][4] = 3.5
    Matri.Notas [1][4] = 9.4
    Matri.Notas [2][4] = 4.5
    Matri.Notas [0][5] = 6.9
    Matri.Notas [1][5] = 3.6
    Matri.Notas [2][5] = 6.4
    Matri.Notas [0][6] = 7.8
    Matri.Notas [1][6] = 6.4
    Matri.Notas [2][6] = 8.8
    Matri.Notas [0][7] = 3.5
    Matri.Notas [1][7] = 8.3
    Matri.Notas [2][7] = 5.6
    Matri.Notas [0][8] = 4.5
    Matri.Notas [1][8] = 6.4
    Matri.Notas [2][8] = 5.4
    Matri.Notas [0][9] = 4.5
    Matri.Notas [1][9] = 6.4
    Matri.Notas [2][9] = 5.4
val Notafinal: Array<Double?> = arrayOfNulls(15)
    Notafinal[0] = Matri.media(Matri.Notas,0)
    Notafinal[1] = Matri.media(Matri.Notas,1)
    Notafinal[2] = Matri.media(Matri.Notas,2)
    Notafinal[3] = Matri.media(Matri.Notas,3)
    Notafinal[4] = Matri.media(Matri.Notas,4)
    Notafinal[5] = Matri.media(Matri.Notas,5)
    Notafinal[6] = Matri.media(Matri.Notas,6)
    Notafinal[7] = Matri.media(Matri.Notas,7)
    Notafinal[8] = Matri.media(Matri.Notas,8)
    Notafinal[9] = Matri.media(Matri.Notas,9)
    for (i in 0..9){
         println("${Matri.Als[i]}${Notafinal[i]}")

    }
}
