package br.com.dio.desafio.dominio;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static GerenciadorBootcamp gerenciador = new GerenciadorBootcamp();

    public static void executarMenu() {
        boolean option = true;

        while (option) {
            System.out.println("\n=== SISTEMA DE BOOTCAMP ===");
            System.out.println("1. Gerenciar Mentoria");
            System.out.println("2. Gerenciar Curso");
            System.out.println("3. Gerenciar Bootcamp");
            System.out.println("4. Gerenciar Dev");
            System.out.println("5. Visualizar Progresso");
            System.out.println("6. Realizar Progresso");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    gerenciarMentorias();
                    break;
                case 2:
                    gerenciarCursos();
                    break;
                case 3:
                    gerenciarBootcamps();
                    break;
                case 4:
                    gerenciarDevs();
                    break;
                case 5:
                    visualizarEstatisticas();
                    break;
                case 6:
                    realizarProgresso();
                    break;
                case 0:
                    option = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void gerenciarCursos() {
        System.out.println("\n=== GERENCIAR CURSOS ===");
        System.out.println("1. Criar novo curso");
        System.out.println("2. Listar cursos");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            Curso curso = new Curso();
            System.out.print("Título do curso: ");
            curso.setTitulo(scanner.nextLine());
            System.out.print("Descrição: ");
            curso.setDescricao(scanner.nextLine());
            System.out.print("Carga horária: ");
            curso.setCargaHoraria(scanner.nextInt());
            gerenciador.adicionarCurso(curso);
            System.out.println("Curso criado com sucesso!");
        } else if (opcao == 2) {
            listarCursos();
        }
    }

    private static void gerenciarBootcamps() {
        System.out.println("\n=== GERENCIAR BOOTCAMPS ===");
        System.out.println("1. Criar novo bootcamp");
        System.out.println("2. Listar bootcamps");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            if (gerenciador.getCursosDisponiveis().isEmpty() || gerenciador.getMentoriasDisponiveis().isEmpty()) {
                System.out.println("\nNão há cursos disponíveis para criar um bootcamp!");
                System.out.println("Por favor, cadastre pelo menos um curso ou mentoria primeiro.");
                return;
            }

            Bootcamp bootcamp = new Bootcamp();
            System.out.print("Nome do bootcamp: ");
            bootcamp.setNome(scanner.nextLine());
            System.out.print("Descrição: ");
            bootcamp.setDescricao(scanner.nextLine());

            if (!gerenciador.getCursosDisponiveis().isEmpty()) {
                System.out.println("\nSelecione os cursos para adicionar (0 para parar):");
                listarCursos();
                while (true) {
                    int index = scanner.nextInt();
                    if (index == 0)
                        break;
                    if (index <= gerenciador.getCursosDisponiveis().size()) {
                        bootcamp.getConteudos().add(gerenciador.getCursosDisponiveis().get(index - 1));
                    }
                }
            }

            // Adicionar mentorias
            if (!gerenciador.getMentoriasDisponiveis().isEmpty()) {
                System.out.println("\nSelecione as mentorias para adicionar (0 para parar):");
                listarMentorias();
                while (true) {
                    int index = scanner.nextInt();
                    if (index == 0)
                        break;
                    if (index <= gerenciador.getMentoriasDisponiveis().size()) {
                        bootcamp.getConteudos().add(gerenciador.getMentoriasDisponiveis().get(index - 1));
                    }
                }
            }

            if (bootcamp.getConteudos().isEmpty()) {
                System.out.println("Um bootcamp precisa ter pelo menos um conteúdo (curso ou mentoria)!");
                return;
            }

            gerenciador.adicionarBootcamp(bootcamp);
            System.out.println("Bootcamp criado com sucesso!");
        } else if (opcao == 2) {
            listarBootcamps();
        }
    }

    private static void gerenciarDevs() {
        System.out.println("\n=== GERENCIAR DEVS ===");
        System.out.println("1. Cadastrar novo dev");
        System.out.println("2. Inscrever dev em bootcamp");
        System.out.println("3. Progredir dev");
        System.out.println("4. Listar devs");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                Dev dev = new Dev();
                System.out.print("Nome do dev: ");
                dev.setNome(scanner.nextLine());
                gerenciador.registrarDev(dev);
                System.out.println("Dev cadastrado com sucesso!");
                break;
            case 2:
                if (gerenciador.getDevsRegistrados().isEmpty()) {
                    System.out.println("Nenhum dev cadastrado!");
                    return;
                }
                System.out.println("\nSelecione o dev:");
                listarDevs();
                int devIdx = scanner.nextInt() - 1;

                System.out.println("\nSelecione o bootcamp:");
                listarBootcamps();
                int bootcampIdx = scanner.nextInt() - 1;

                if (devIdx >= 0 && devIdx < gerenciador.getDevsRegistrados().size() &&
                        bootcampIdx >= 0 && bootcampIdx < gerenciador.getBootcamps().size()) {
                    Dev selectedDev = gerenciador.getDevsRegistrados().get(devIdx);
                    Bootcamp selectedBootcamp = gerenciador.getBootcamps().get(bootcampIdx);
                    selectedDev.inscreverBootcamp(selectedBootcamp);
                    System.out.println("Dev inscrito com sucesso!");
                }
                break;
        }
    }

    private static void listarCursos() {
        List<Curso> cursos = gerenciador.getCursosDisponiveis();
        System.out.println("\nCursos disponíveis:");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println((i + 1) + ". " + cursos.get(i).getTitulo() + " - " + cursos.get(i).getDescricao() + " - "
                    + cursos.get(i).getCargaHoraria() + " horas.");
        }
    }

    private static void listarBootcamps() {
        List<Bootcamp> bootcamps = gerenciador.getBootcamps();
        System.out.println("\nBootcamps disponíveis:");

        if (bootcamps.isEmpty()) {
            System.out.println("Não há bootcamps cadastrados.");
            return;
        }

        for (int i = 0; i < bootcamps.size(); i++) {
            Bootcamp bootcamp = bootcamps.get(i);
            System.out.println("\n" + (i + 1) + ". " + bootcamp.getNome());
            System.out.println("   Descrição: " + bootcamp.getDescricao());

            // Listar cursos do bootcamp
            System.out.println("   Cursos:");
            boolean temCurso = false;
            for (Conteudo conteudo : bootcamp.getConteudos()) {
                if (conteudo instanceof Curso) {
                    System.out.println("   - " + conteudo.getTitulo());
                    temCurso = true;
                }
            }
            if (!temCurso) {
                System.out.println("   - Nenhum curso cadastrado");
            }

            // Listar mentorias do bootcamp
            System.out.println("   Mentorias:");
            boolean temMentoria = false;
            for (Conteudo conteudo : bootcamp.getConteudos()) {
                if (conteudo instanceof Mentoria) {
                    System.out.println("   - " + conteudo.getTitulo());
                    temMentoria = true;
                }
            }
            if (!temMentoria) {
                System.out.println("   - Nenhuma mentoria cadastrada");
            }

            // Listar devs inscritos
            System.out.println("   Devs inscritos:");
            boolean temDevs = false;
            for (Dev dev : gerenciador.getDevsRegistrados()) {
                if (dev.getConteudosInscritos().containsAll(bootcamp.getConteudos())) {
                    System.out.println("   - " + dev.getNome());
                    temDevs = true;
                }
            }
            if (!temDevs) {
                System.out.println("   - Nenhum dev inscrito");
            }

            System.out.println("   Data início: " + bootcamp.getDataInicial());
            System.out.println("   Data fim: " + bootcamp.getDataFinal());
            System.out.println("----------------------------------------");
        }
    }

    private static void listarDevs() {
        List<Dev> devs = gerenciador.getDevsRegistrados();
        System.out.println("\nDevs cadastrados:");
        for (int i = 0; i < devs.size(); i++) {
            System.out.println((i + 1) + ". " + devs.get(i).getNome());
        }
    }

    private static void listarMentorias() {
        List<Mentoria> mentorias = gerenciador.getMentoriasDisponiveis();
        System.out.println("\nMentorias disponíveis:");
        for (int i = 0; i < mentorias.size(); i++) {
            System.out.println((i + 1) + ". " + mentorias.get(i).getTitulo() + " - "
                    + mentorias.get(i).getDescricao() + " - " + mentorias.get(i).getData());
        }
    }

    private static void gerenciarMentorias() {
        System.out.println("\n=== GERENCIAR MENTORIAS ===");
        System.out.println("1. Criar nova mentoria");
        System.out.println("2. Listar mentorias");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            Mentoria mentoria = new Mentoria();
            System.out.print("Título da mentoria: ");
            mentoria.setTitulo(scanner.nextLine());
            System.out.print("Descrição: ");
            mentoria.setDescricao(scanner.nextLine());
            System.out.print("Data (dd/mm/aaaa): ");
            String data = scanner.nextLine();
            // Converter string para LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            mentoria.setData(LocalDate.parse(data, formatter));

            gerenciador.adicionarMentoria(mentoria);
            System.out.println("Mentoria criada com sucesso!");
        } else if (opcao == 2) {
            List<Mentoria> mentorias = gerenciador.getMentoriasDisponiveis();
            System.out.println("\nMentorias disponíveis:");
            for (int i = 0; i < mentorias.size(); i++) {
                System.out.println((i + 1) + ". " + mentorias.get(i).getTitulo() + " - "
                        + mentorias.get(i).getDescricao() + " - Data: " + mentorias.get(i).getData());
            }
        }
    }

    private static void visualizarEstatisticas() {
        System.out.println("\n=== ESTATÍSTICAS DO BOOTCAMP ===");

        // Estatísticas gerais
        System.out.println("\nEstatísticas Gerais:");
        System.out.println("Total de Bootcamps: " + gerenciador.getBootcamps().size());
        System.out.println("Total de Devs: " + gerenciador.getDevsRegistrados().size());
        System.out.println("Total de Cursos: " + gerenciador.getCursosDisponiveis().size());
        System.out.println("Total de Mentorias: " + gerenciador.getMentoriasDisponiveis().size());

        // Estatísticas por Dev
        System.out.println("\nProgresso dos Devs:");
        for (Dev dev : gerenciador.getDevsRegistrados()) {
            System.out.println("\nDev: " + dev.getNome());
            System.out.println("XP Total: " + dev.calcularTotalXp());
            System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos().size());
            System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos().size());
        }
    }

    private static void realizarProgresso() {
        System.out.println("\n=== REALIZAR PROGRESSO ===");
        
        if (gerenciador.getDevsRegistrados().isEmpty()) {
            System.out.println("Não há devs cadastrados!");
            return;
        }

        System.out.println("\nSelecione o dev:");
        listarDevs();
        int devIdx = scanner.nextInt() - 1;
        scanner.nextLine();

        if (devIdx < 0 || devIdx >= gerenciador.getDevsRegistrados().size()) {
            System.out.println("Dev inválido!");
            return;
        }

        Dev dev = gerenciador.getDevsRegistrados().get(devIdx);
        
        if (dev.getConteudosInscritos().isEmpty()) {
            System.out.println("Este dev não está inscrito em nenhum conteúdo!");
            return;
        }

        System.out.println("\nConteúdos disponíveis para progresso:");
        List<Conteudo> conteudosInscritos = new ArrayList<>(dev.getConteudosInscritos());
        for (int i = 0; i < conteudosInscritos.size(); i++) {
            Conteudo conteudo = conteudosInscritos.get(i);
            String tipo = conteudo instanceof Curso ? "Curso" : "Mentoria";
            System.out.println((i + 1) + ". [" + tipo + "] " + conteudo.getTitulo());
        }

        System.out.print("\nSelecione o conteúdo a ser concluído (0 para cancelar): ");
        int conteudoIdx = scanner.nextInt() - 1;
        scanner.nextLine();

        if (conteudoIdx >= 0 && conteudoIdx < conteudosInscritos.size()) {
            dev.progredir();
            System.out.println("Progresso realizado com sucesso!");
            System.out.println("XP ganho: " + conteudosInscritos.get(conteudoIdx).calcularXP());
            System.out.println("XP total do dev: " + dev.calcularTotalXp());
        } else if (conteudoIdx != -1) {
            System.out.println("Opção inválida!");
        }
    }
}
