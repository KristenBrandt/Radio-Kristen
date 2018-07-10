/** Kristen Brandt
 *  radio ejercicio **/

/** programa que si sirve **/

fun main (args: Array<String>) {

    /** variables **/
    var opcionprincipal = 3
    var opciondos = 6
    var opcionradio = 6
    var am = 90
    var freq1 = 90
    var fm = 1200
    var opcionvol = 50
    var vol = 50
    var numero = 3


    /** menu principal, encender el radio o salir del programa **/

    while (opcionprincipal != 2){
        println(" 1 : Encender el radio")
        println(" 2 : Apagar el radio")
        opcionprincipal = readLine()!!.toInt()

        /** menu secundario, cuando el radio ya esta prendido, decidir tipo de modulacion, volumen o regresar
         * al menu principal **/

        when (opcionprincipal) {
            1 -> {println("El radio se esta encendiendo")
                println()
                while (opciondos != 3){
                    println("1: Decidir tipo de modulación (AM o FM)")
                    println("2: Decidir volumen")
                    println("3: Regresar a menu principal")
                    opciondos = readLine()!!.toInt()

                    /** decidir el tipo de modulación AM o FM, o regresar al menu de opciones **/

                    when (opciondos){
                        1 ->{println("Que tipo de modulación quiere?")
                            while (opcionradio !=3) {
                                println("1: AM")
                                println("2: FM")
                                println("3: Regresar a menu de opciones")
                                opcionradio = readLine()!!.toInt()

                                when (opcionradio){
                                    1 -> { println("Ingreso a modo AM, en este modo se puede ir de la frequencia " +
                                            "87 a 100, actualmente se encuentra el la frequencia 90")
                                        println()
                                        while (am != 6){
                                            println("1: Incrementar la frequencia en forma unitaria")
                                            println("2: Disminuir la frequencia en forma unitaria")
                                            println("3: Incrementar la frequencia en pasos de 5")
                                            println("4: Disminuir la frequencia en pasos de 5")
                                            println("5: Poner un valor exacto de frequencia")
                                            println("6:Salir al menu de modulaciones")
                                            am = readLine()!!.toInt()

                                            /** menu para cambiar de frequencia **/
                                            when (am){
                                                1 -> {freq1 = freq1 + 1
                                                    println("La nueva frecuencia es de $freq1")
                                                    println()
                                                }
                                                2 -> {freq1 = freq1 - 1
                                                    println("La nueva frecuencia es de $freq1")
                                                    println()
                                                }
                                                3 -> {freq1 = freq1 + 5
                                                    println("La nueva frecuencia es de $freq1")
                                                    println()
                                                }
                                                4 -> {freq1 = freq1 - 5
                                                    println("La nueva frecuencia es de $freq1")
                                                    println()
                                                }
                                            }
/** falta poner que hacer para cada una de estas opciones **/
                                        }
                                    }
                                }
                            }
                        }

                        /** menu de volumen, subir y bajar volumen o salir a menu de opciones **/
                        2 -> {println("El volumen puede ir de 0 a 100, actualmente tiene volumen 50")
                            println()
                            while (opcionvol != 4) {
                                println("1: Subir volumen en forma unitaria")
                                println("2: Bajar volumen en forma unitaria")
                                println("3: Escoger un volumen especifico")
                                println("4: Salir a menu de opciones")
                                opcionvol = readLine()!!.toInt()

                                when (opcionvol) {
                                    1 -> {vol = vol + 1
                                        println("El nuevo volumen es de $vol")
                                        println()
                                    }
                                    2 ->{ vol= vol - 1
                                        println("El nuevo volumen es de $vol")
                                        println()
                                    }
                                    3 -> {
                                        println("Escriba un numero de volumen que desea")
                                        numero= readLine()!!.toInt()
                                        if (numero in 0..100){
                                            vol = numero
                                            println("El volumen actual es de $vol")
                                            println()}
                                        else {println("El valor $numero no es aceptado, porfavor ingrese un numero " +
                                                "entre 0 y 100")
                                            println()}
                                    }
                                    4 -> {
                                        println("Saliendo a menu de opciones")
                                        println()
                                    }
                                }
                            }
                        }
                        3 -> println("Se esta regresando al menu principal")
                    }
                }
            }
            2 -> println("Se esta apagando el radio")
            else -> println("Ese numero no es valido intente denuevo con un 1 o 2")
        }
        }
}
