package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
    }

    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    public String toString() {
        return "Curso{" + "titulo= " + getTitulo() + ", descrição= " + getDescricao() + "cargaHoraria= " + cargaHoraria + '}';


    }
}
