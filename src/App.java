import java.util.Scanner;

public class App {
    static Turma[] turmas = new Turma[10];
    static Campus[] campuss = new Campus[10];
    static Curso[] cursos = new Curso[10];
    static Matricula[] matriculas = new Matricula[10];
    static Aluno[] alunos = new Aluno[10];

    static int quantidadeTurma = 0;
    static int quantidadeAlunos = 0;
    static int quantidadeCampus = 0;
    static int quantidadeCursos = 0;
    static int quantidadeMatriculas = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opcao = 0;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            roteador(opcao);
        } while (opcao != 0);
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarTurma();
                break;
            case 2:
                cadastrarCampus();
                break;
            case 3:
                cadastrarCurso();
                break;
            case 4:
                cadastrarAluno();
                break;
            case 5:
                cadastrarMatricula();
                break;    
            case 6:
                gerarRelatorio();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Opção inválida");
                }
                break;
        }
    }



    private static void cadastrarMatricula() {
        scanner.nextLine();
        Matricula matricula = new Matricula();
        System.out.println("Digite o R.A da matrícula: ");
        matricula.ra = scanner.nextLine();
        System.out.println("Digite a data da matrícula: ");
        matricula.data = scanner.nextLine();
        System.out.println("Digite a situação desta matrícula: ");
        matricula.situacao = scanner.nextBoolean();
        matriculas[quantidadeMatriculas] = matricula;
        quantidadeMatriculas++;
    }   

    private static void cadastrarAluno() {
        scanner.nextLine();
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.println("Digite o CPF do aluno: ");
        aluno.cpf = scanner.nextLine();
        System.out.println("Digite o telefone do aluno: ");
        aluno.telefone = scanner.nextLine();
        System.out.println("Digite o endereço do aluno: ");
        aluno.endereco = scanner.nextLine();
        System.out.println("Digite a data de nascimento do aluno: ");
        aluno.dataNascimento = scanner.nextLine();
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    private static void cadastrarCurso() {
        scanner.nextLine();
        Curso curso = new Curso();
        System.out.println("Digite o nome do Curso: ");
        curso.nome = scanner.nextLine();
        System.out.println("Digite a duração do Curso: ");
        curso.duracao = scanner.nextLine();
        System.out.println("Digite a modalidade do curso: ");
        curso.modalidade = scanner.nextLine();
        cursos[quantidadeCursos] = curso;
        quantidadeCursos++;
    }

    private static void cadastrarCampus() {
        scanner.nextLine();
        Campus campus = new Campus();
        System.out.println("Digite o nome do Campus: ");
        campus.nome = scanner.nextLine();
        System.out.println("Digite o endereço do Campus: ");
        campus.endereco = scanner.nextLine();
        System.out.println("Digite a cidade do Campus: ");
        campus.cidade = scanner.nextLine();
        campuss[quantidadeCampus] = campus;
        quantidadeCampus++;
    }

    public static void gerarRelatorio() {
        for (int i = 0; i < quantidadeTurma; i++) {
            System.out.println("Nome turma: "+ turmas[i].nome);
            System.out.println("Numero minimo: "+ turmas[i].numeroMinimo);
            System.out.println("Ano de ingresso: "+ turmas[i].anoIngresso);
        }

        for (int i = 0; i < quantidadeCampus; i++) {
            System.out.println("Nome do Campus: "+ campuss[i].nome);
            System.out.println("Endereço: "+ campuss[i].endereco);
            System.out.println("Cidade: "+ campuss[i].cidade);
        }

        for (int i = 0; i < quantidadeCursos; i++) {
            System.out.println("Nome do Curso: "+ cursos[i].nome);
            System.out.println("Duração: "+ cursos[i].duracao);
            System.out.println("Modalidade: "+ cursos[i].modalidade);
        }
        
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Nome do aluno: "+ alunos[i].nome);
            System.out.println("CPF: "+ alunos[i].cpf);
            System.out.println("Telefone: "+ alunos[i].telefone);
            System.out.println("Endereço: "+ alunos[i].endereco);
            System.out.println("Data de nascimento: "+ alunos[i].dataNascimento);
        }

        for (int i = 0; i < quantidadeMatriculas; i++) {
            System.out.println("R.A: "+ matriculas[i].ra);
            System.out.println("Duração: "+ matriculas[i].data);
            System.out.println("Situação: "+ matriculas[i].situacao);
        }

    }

    public static void cadastrarTurma() {
        scanner.nextLine();//apaga o enter (\n)
        Turma turma = new Turma();
        System.out.println("Digite o nome da turma: ");
        turma.nome = scanner.nextLine();
        System.out.println("Digite a numero minimo de alunos: ");
        turma.numeroMinimo = scanner.nextInt();
        System.out.println("Digite o ano de ingresso: ");
        turma.anoIngresso = scanner.nextInt();
        turmas[quantidadeTurma] = turma;
        quantidadeTurma++;
    }

    public static void exibirMenu() {
        System.out.println("============================");
        System.out.println("[1] Cadastro de turma: ");
        System.out.println("[2] Cadastro de campus: ");
        System.out.println("[3] Cadastro de curso: ");
        System.out.println("[4] Cadastro de estudante: ");
        System.out.println("[5] Cadastro de matricula: ");
        System.out.println("[6] Exibir tudo: ");
        System.out.println("[0] Sair: ");
        System.out.println("============================");
    }
}
