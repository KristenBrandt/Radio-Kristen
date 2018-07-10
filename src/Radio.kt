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
    var freq2 = 1200
    var fm = 1200
    var opcionvol = 50
    var vol = 50
    var numero = 3
    var numi = 3


    /** menu principal, encender el radio o salir del programa **/

    while (opcionprincipal != 2){
        opciondos = 6
        println(" 1 : Encender el radio")
        println(" 2 : Apagar el radio")
        opcionprincipal = readLine()!!.toInt()

        /** menu secundario, cuando el radio ya esta prendido, decidir tipo de modulacion, volumen o regresar
         * al menu principal **/

        when (opcionprincipal) {
            1 -> {println("El radio se esta encendiendo")
                println()
                while (opciondos != 3){
                    opcionradio =6
                    opcionvol = 50
                    println("1: Decidir tipo de modulación (AM o FM)")
                    println("2: Decidir volumen")
                    println("3: Regresar a menu principal")
                    opciondos = readLine()!!.toInt()

                    /** decidir el tipo de modulación AM o FM, o regresar al menu de opciones **/

                    when (opciondos){
                        1 ->{println("Que tipo de modulación quiere?")
                            while (opcionradio !=3) {
                                am = 90
                                fm = 1200
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
                                                    if (freq1 in 87..100){
                                                    println("La nueva frecuencia es de $freq1")
                                                    println()}
                                                    else { println("El valor no puede ser mayor a 100 ni menor a 87. " +
                                                            "Su valor actual de de 100")
                                                        freq1 -= 1
                                                        println()}
                                                }
                                                2 -> {freq1 = freq1 - 1
                                                    if (freq1 in 87..100){
                                                    println("La nueva frecuencia es de $freq1")
                                                    println()}
                                                    else { println("El valor no puede ser mayor a 100 ni menor a 87. " +
                                                            "Su valor actual de de 87")
                                                        freq1 += 1
                                                        println()}
                                                }
                                                3 -> {freq1 = freq1 + 5
                                                    if (freq1 in 87..100){
                                                    println("La nueva frecuencia es de $freq1")
                                                    println()}
                                                    else { println("El valor no puede ser mayor a 100 ni menor a 87. Su " +
                                                            "valor actual es de 100")
                                                        freq1 = 100
                                                        println()}
                                                }
                                                4 -> {freq1 = freq1 - 5
                                                    if (freq1 in 87..100){
                                                    println("La nueva frecuencia es de $freq1")
                                                    println()}
                                                    else { println("El valor no puede ser mayor a 100 ni menor a 87. Su " +
                                                            "valor actual es de 87 ")
                                                        freq1 = 87
                                                        println()}
                                                }
                                                5 -> {
                                                    println("Escriba un numero de frequencia que desea")
                                                    numi= readLine()!!.toInt()
                                                    if (numi in 87..100){
                                                        freq1 = numi
                                                        println("La frequencia actual es de $freq1")
                                                        println()}
                                                    else {println("El valor $numi no es aceptado, porfavor ingrese un numero " +
                                                            "entre 87 y 100")
                                                        println()}
                                                }
                                            }

                                        }
                                    }
                                    2 -> { println("Ingreso a modo FM, en este modo se puede ir de la frequencia " +
                                            "1000 a 1400, actualmente se encuentra el la frequencia 1200")
                                        println()
                                        while (fm != 6) {
                                            println("1: Incrementar la frequencia en forma unitaria")
                                            println("2: Disminuir la frequencia en forma unitaria")
                                            println("3: Incrementar la frequencia en pasos de 5")
                                            println("4: Disminuir la frequencia en pasos de 5")
                                            println("5: Poner un valor exacto de frequencia")
                                            println("6:Salir al menu de modulaciones")
                                            fm = readLine()!!.toInt()

                                            /** menu para cambiar de frecuencia **/

                                            when (fm){
                                                1 -> {freq2 = freq2 + 1
                                                    if (freq2 in 1000..1400){
                                                        println("La nueva frecuencia es de $freq2")
                                                        println()}
                                                    else { println("El valor no puede ser mayor a 1400 ni menor a 1000. " +
                                                            "Su valor actual de de 1400")
                                                        freq2 -= 1
                                                        println()}
                                                }
                                                2 -> {freq2 = freq2 - 1
                                                    if (freq2 in 1000..1400){
                                                        println("La nueva frecuencia es de $freq2")
                                                        println()}
                                                    else { println("El valor no puede ser mayor a 1400 ni menor a 1000. " +
                                                            "Su valor actual de de 1000")
                                                        freq2 += 1
                                                        println()}
                                                }
                                                3 -> {freq2 = freq2 + 5
                                                    if (freq2 in 1000..1400){
                                                        println("La nueva frecuencia es de $freq2")
                                                        println()}
                                                    else { println("El valor no puede ser mayor a 1400 ni menor a 1000. Su " +
                                                            "valor actual es de 1400")
                                                        freq2 = 1400
                                                        println()}
                                                }
                                                4 -> {freq2 = freq2 - 5
                                                    if (freq2 in 1000..1400){
                                                        println("La nueva frecuencia es de $freq2")
                                                        println()}
                                                    else { println("El valor no puede ser mayor a 1400 ni menor a 1000. Su " +
                                                            "valor actual es de 1000 ")
                                                        freq2 = 1000
                                                        println()}
                                                }
                                                5 -> {
                                                    println("Escriba un numero de frequencia que desea")
                                                    numi= readLine()!!.toInt()
                                                    if (numi in 1000..1400){
                                                        freq2 = numi
                                                        println("La frequencia actual es de $freq2")
                                                        println()}
                                                    else {println("El valor $numi no es aceptado, porfavor ingrese un numero " +
                                                            "entre 1000 y 1400")
                                                        println()}
                                                }}

                                        }}
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
                                        if (vol in 0..100){
                                            println("El nuevo volumen es de $vol")
                                            println()}
                                        else { println("El valor no puede ser mayor a 100 ni menor a 0. Su " +
                                                "valor actual es de 100 ")
                                            vol = 100
                                            println()}
                                    }
                                    2 ->{ vol= vol - 1
                                        if (vol in 0..100){
                                            println("El nuevo volumen es de $vol")
                                            println()}
                                        else { println("El valor no puede ser mayor a 100 ni menor a 0. Su " +
                                                "valor actual es de 0 ")
                                            vol = 0
                                            println()}
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
