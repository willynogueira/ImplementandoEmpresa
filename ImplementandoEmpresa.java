/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementandoempresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lbarceloss
 */
public class ImplementandoEmpresa {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Empresa> empresas = new ArrayList<>();
    public static List<MateriaPrima> materias = new ArrayList<>();
    
    public static void main(String[] args) {
        byte opcao;
        do {
            System.out.println("1 - Cadastrar Empresa");
            System.out.println("2 - Editar Empresa");
            System.out.println("0 - Sair");
            opcao = scanner.nextByte();
            switch(opcao) {
                case 1:
                    cadastrarEmpresa();
                    break;
                case 2:
                    editarEmpresa();
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }
    
    public static void cadastrarEmpresa() {
        System.out.println("Cadastrando Empresa");
        Empresa empresa = promptEmpresa();
        empresas.add(empresa);
        System.out.println("Empresa cadastrada com sucesso");
    }
    
    public static void editarEmpresa() {
        System.out.print("Digite o nome da empresa: ");
        String nome = scanner.next();
        Empresa empresa = procurarEmpresa(nome);
        if (empresa == null) {
            System.out.println("Empresa não encontrada");
        } else {
            byte opcao;
            do {
                System.out.println("Empresa " + empresa.getNome());
                System.out.println("1 - Cadastrar Produto");
                System.out.println("2 - Listar Produtos");
                System.out.println("3 - Listar Pessoas");
                System.out.println("4 - Cadastrar Cliente");
                System.out.println("5 - Cadastrar Empregado");
                System.out.println("6 - Cadastrar Fornecedor");
                System.out.println("7 - Editar Fornecedor");
                System.out.println("0 - Sair");
                opcao = scanner.nextByte();
                switch(opcao) {
                    case 1:
                        cadastrarProduto(empresa);
                        break;
                    case 2:
                        listarProdutos(empresa);
                        break;
                    case 3:
                        listarPessoas(empresa);
                        break;
                    case 4:
                        cadastrarCliente(empresa);
                        break;
                    case 5:
                        cadastrarEmpregado(empresa);
                        break;
                    case 6:
                        cadastrarFornecedor(empresa);
                        break;
                    case 7:
                        editarFornecedor(empresa);
                    case 0:
                        System.out.println("Saindo");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } while (opcao != 0);
        }
    }
    
    public static void editarFornecedor(Empresa empresa) {
        System.out.print("Nome do Fornecedor: ");
        String nome = scanner.next();
        Fornecedor f = procurarFornecedor(empresa, nome);
        if (f == null) {
            System.out.println("Não encontrado");
        } else {
            byte opcao;
            do {
                System.out.println("1 - Cadastrar Fornecimento");
                System.out.println("2 - Exibir");
                System.out.println("0 - Sair");
                opcao = scanner.nextByte();
                switch(opcao) {
                    case 1:
                        cadastrarFornecimento(f);
                        break;
                    case 2:
                        exibirFornecedor(f);
                        break;
                    case 0:
                        System.out.println("Saindo");
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } while (opcao != 0);
        }
    }
    
    public static void cadastrarFornecimento(Fornecedor f) {
        System.out.print("Código da Matéria Prima: ");
        int codigo = scanner.nextInt();
        MateriaPrima mp = encontrarMateriaPrima(codigo);
        
        if (mp == null) {
            System.out.println("Não encontrado");
        } else {
            Fornece fornece = promptFornece(f, mp);
            f.addFornece(fornece);
        }
    }
    
    public static void exibirFornecedor(Fornecedor f) {
        System.out.println("Exibindo Fornecedor");
        f.mostrar();
    }
    
    public static MateriaPrima encontrarMateriaPrima(int codigo) {
        for (MateriaPrima mp : materias) {
            if (mp.getCodigo() == codigo) return mp;
        }
        
        return null;
    }
    
    public static Fornecedor procurarFornecedor(Empresa empresa, String nome) {
        for (Fornecedor f : empresa.getFornecedores()) {
            if (f.getNome().equalsIgnoreCase(nome)) return f;
        }
        
        return null;
    }
    
    public static void cadastrarProduto(Empresa empresa) {
        Produto p = promptProduto();
        empresa.addProduto(p);
        System.out.println("Produto adicionado com sucesso.");
    }
    
    public static void listarProdutos(Empresa empresa) {
        System.out.println("Listando Produtos");
        empresa.mostrarProdutos();
    }
    
    public static void listarPessoas(Empresa empresa) {
        System.out.println("Listando Pessoas");
        empresa.mostrarPessoas();
    }
    
    public static void cadastrarCliente(Empresa empresa) {
        System.out.println("Cadastro de Cliente");
        Cliente cliente = promptCliente();
        empresa.addPessoa(cliente);
    }
    
    public static void cadastrarFornecedor(Empresa empresa) {
        System.out.println("Cadastro de Fornecedor");
        Fornecedor fornecedor = promptFornecedor();
        empresa.addPessoa(fornecedor);
    }
    
    public static void cadastrarEmpregado(Empresa empresa) {
        System.out.println("Cadastro de Empregado");
        Empregado empregado = promptEmpregado();
        empresa.addPessoa(empregado);
    }
    
    public static Empresa procurarEmpresa(String nome) {
        for (Empresa empresa : empresas) {
            if (empresa.getNome().equalsIgnoreCase(nome)) return empresa;
        }
        
        return null;
    }
    
    public static Produto promptProduto() {
        String designacao;
        float precoVendaPublico;
        int stock;

        System.out.print("Designação: ");
        designacao = scanner.next();
        
        System.out.print("Preço venda público: ");
        precoVendaPublico = scanner.nextFloat();
        
        System.out.print("Estoque: ");
        stock = scanner.nextInt();
        
        return new Produto(designacao, precoVendaPublico, stock);
    }
    
    public static CodigoPostal promptCP() {
        int indicativo;
        int extensao;
        String zona;
          
        System.out.print("Indicativo: ");
        indicativo = scanner.nextInt();
        
        System.out.print("Extensão: ");
        extensao = scanner.nextInt();
        
        System.out.print("Zona: ");
        zona = scanner.next();
        
        return new CodigoPostal(indicativo, extensao, zona);
    }
    
    public static Empresa promptEmpresa() {
        String nome;
        int dataFundacao;
        CodigoPostal cp;
        
        System.out.print("Nome: ");
        nome = scanner.next();
        
        System.out.print("Data Fundação: ");
        dataFundacao = scanner.nextInt();
        
        cp = promptCP();
        
        return new Empresa(nome, dataFundacao, cp);
    }
    
    public static Pessoa promptPessoa() {
        String nome;
        long contribuinte;
        byte idade;
        CodigoPostal cp;
        
        System.out.print("Nome: ");
        nome = scanner.next();
        
        System.out.print("Contribuinte: ");
        contribuinte = scanner.nextLong();
        
        System.out.print("Idade: ");
        idade = scanner.nextByte();
        
        cp = promptCP();
        
        return new Pessoa(nome, contribuinte, idade, cp);
    }
    
    public static Fornecedor promptFornecedor() {
        Pessoa p;
        //CodigoPostal cp;
        float plafond;
        float valorEmDivida;
        
        p = promptPessoa();
        
        //cp = promptCP();
        
        System.out.print("Plafond: ");
        plafond = scanner.nextFloat();
        
        System.out.print("Valor em dívida: ");
        valorEmDivida = scanner.nextFloat();
        
        return new Fornecedor(plafond, valorEmDivida, p.getNome(), p.getContribuinte(), p.getIdade(),p.getCp());
    }
    
    public static Empregado promptEmpregado() {
        Pessoa p;
        //CodigoPostal cp;
        int numeroSecao;
        float salarioBase;
        float iRS;
        
        p = promptPessoa();
        
        //cp = promptCP();
        
        System.out.print("Número Seção: ");
        numeroSecao = scanner.nextInt();
        
        System.out.print("Salário Base: ");
        salarioBase = scanner.nextFloat();
        
        System.out.print("iRS: ");
        iRS = scanner.nextFloat();
        
        return new Empregado(numeroSecao, salarioBase, iRS, p.getNome(), p.getContribuinte(), p.getIdade(), p.getCp());
    }
    
    public static Cliente promptCliente() {
        Pessoa p;
        //CodigoPostal cp;
        float plafond;
        float valorEmDivida;
        
        p = promptPessoa();
        
        //cp = promptCP();
        
        System.out.print("Plafond: ");
        plafond = scanner.nextFloat();
        
        System.out.print("Valor em dívida: ");
        valorEmDivida = scanner.nextFloat();
        
        return new Cliente(plafond, valorEmDivida, p.getNome(), p.getContribuinte(), p.getIdade(), p.getCp());
    }
    
    public static MateriaPrima promptMateriaPrima() {
        String origem;
        int codigo;
        float custo;
        
        System.out.print("Origem: ");
        origem = scanner.next();
        
        System.out.print("Código: ");
        codigo = scanner.nextInt();
        
        System.out.print("Custo: ");
        custo = scanner.nextFloat();
        
        return new MateriaPrima(origem, codigo, custo);
    }
    
    public static Fornece promptFornece() {
        Fornecedor fornecedor;
        MateriaPrima materia;
        int quantidade;
        int data;
        
        fornecedor = promptFornecedor();
        
        materia = promptMateriaPrima();
        
        System.out.print("Quantidade: ");
        quantidade = scanner.nextInt();
        
        System.out.print("Data: ");
        data = scanner.nextInt();
        
        return new Fornece(fornecedor, materia, quantidade, data);
    }
    
    public static Fornece promptFornece(Fornecedor fornecedor, MateriaPrima materia) {
        int quantidade;
        int data;
        
        System.out.print("Quantidade: ");
        quantidade = scanner.nextInt();
        
        System.out.print("Data: ");
        data = scanner.nextInt();
        
        return new Fornece(fornecedor, materia, quantidade, data);
    }
}
