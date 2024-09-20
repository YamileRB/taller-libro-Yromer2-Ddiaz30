package biblioteca;

public class Libro {

    String titulo;
    String autor;
    int numero_de_paginas;
    int fecha_de_publicacion;

    public Libro(String titulo, String autor, int numero_de_paginas, int fecha_de_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_de_paginas = numero_de_paginas;
        this.fecha_de_publicacion = fecha_de_publicacion;

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_de_paginas() {
        return numero_de_paginas;
    }

    public void setNumero_de_paginas(int numero_de_paginas) {
        this.numero_de_paginas = numero_de_paginas;
    }

    public int getFecha_de_publicacion() {
        return fecha_de_publicacion;
    }

    public void setFecha_de_publicacion(int fecha_de_publicacion) {
        this.fecha_de_publicacion = fecha_de_publicacion;
    }

    //Mostrar datos personas
    public void mostrarDatosLibro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numero_de_paginas);
        System.out.println("Año de publicacion: " + fecha_de_publicacion);

    }
}

