package br.com.dio.desafio.dominio;
import java.util.List;
import java.util.ArrayList;



public class GerenciadorBootcamp {
    private List<Bootcamp> bootcamps = new ArrayList<>();
    private List<Curso> cursosDisponiveis = new ArrayList<>();
    private List<Mentoria> mentoriasDisponiveis = new ArrayList<>();
    private List<Dev> devsRegistrados = new ArrayList<>();

    public void adicionarCurso(Curso curso) {
        cursosDisponiveis.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentoriasDisponiveis.add(mentoria);
    }

    public void adicionarBootcamp(Bootcamp bootcamp) {
        bootcamps.add(bootcamp);
    }

    public List<Bootcamp> getBootcamps() {
        return bootcamps;
    }

    public List<Curso> getCursosDisponiveis() {
        return cursosDisponiveis;
    }

    public List<Mentoria> getMentoriasDisponiveis() {
        return mentoriasDisponiveis;
    }

    public List<Dev> getDevsRegistrados() {
        return devsRegistrados;
    }

    public void registrarDev(Dev dev) {
        devsRegistrados.add(dev);
    }
}
