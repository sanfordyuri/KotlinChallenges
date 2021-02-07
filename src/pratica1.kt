fun main() {
    name("YURI SANFORD");
}

fun name(name:String) {

    var _name = name.replace(" ", "");
    val c = _name.toCharArray();

    var verificadas: List<Char> = ArrayList()
    var tamanho = c.size;

   while (tamanho > 0) {
       var contador = 0;
        for(i in 0..tamanho-1) {
            if(!verificadas.contains(c[i])) {
                if (c[tamanho - 1] == c[i]) {
                    contador++;
                }
            }
        }
           if(!verificadas.contains(c[tamanho-1])) {
               println("${c[tamanho-1]} = $contador");
           }
       contador = 0;
       verificadas += c[tamanho-1];
       tamanho--;
    }
}