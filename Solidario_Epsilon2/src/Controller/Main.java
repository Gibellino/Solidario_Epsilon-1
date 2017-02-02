/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.PrintStream;
import java.util.Scanner;

import model.Atividade;
public class Main {
    
    public static  int quantidade =0;
    static Atividade [] a;
    
public static void inserir(){

        Scanner read = new Scanner(System.in);
		 int  resposta=0;
		
		System.out.println("Indique quantos eventos quer introduzir");
		quantidade = read.nextInt();
                
                


                    a = new Atividade[quantidade];
		
		/*
                int ID_Evento=0;
                String evento;
                int numeroPessoas=0;
                String veiculo="";
                String data;
                String responsavel;
                */
		//Atividades Atividade   = new Atividades ();
		
		for(int i=0; i < quantidade; i++){
			
                        a[i] = new Atividade();
                       
                    
			System.out.println("Indique o evento");
			read.nextLine();
			a[i].setevento(read.nextLine());
			
			System.out.println("Numero de pessoas presentes");
			a[i].setnumeroPessoas(read.nextInt());
			
			System.out.println("Foi utilizado veiculo?(1-sim/2-Nao)");
			resposta = read.nextInt();
				
			if ( resposta == 1){
				System.out.println("Indique a marca do veiculo");
				read.nextLine();
				a[i].setVeiculo(read.nextLine());
			}
				System.out.println("Indique a data do evento");
				read.nextLine();
				a[i].setData(read.nextLine());
				
				System.out.println("Indique um responsavel por esta atividade");
				read.nextLine();
				a[i].setResponsavel(read.nextLine());
		
                            a[i].setID_Evento(i+1);
                                
                                //a[i] = new Atividade(ID_Evento,evento,numeroPessoas, veiculo, data, responsavel);
		}		
}
    
public static void listar(){
        /*
            Atividade [] a;
                a = new Atividade[read.nextInt()];
        */
        for (int i =0; i < a.length ; i++){
            System.out.println("Atividade: " + a[i].getevento());
            System.out.println("Data:" + a[i].getData());
            System.out.println("Responsavel: " + a[i].getResponsavel());
            System.out.println("Pessoas Presentes :" + a[i].getnumeroPessoas());
            System.out.println("Veiculo: " + a[i].getVeiculo());
        }
    }
    
public static void procurar(){
        
               // Atividade [] a;
              //  a = new Atividade[quantidade];
                String procurar;
                Scanner read = new Scanner(System.in);
               /// System.out.println( a[0].getevento());
        System.out.println("Indique o evento que queira procurar ");
		procurar = read.nextLine();
		System.out.println(quantidade);
                
		for (int i=0; i < a.length; i++){
                    ///System.out.println("Ola");
                    System.out.println(a[i].getevento());
			if(procurar.equals(a[i].getevento())){
                           
				System.out.println("Evento: " + a[i].getevento() );
				System.out.println("Numero de pessoas presentes: " + a[i].getnumeroPessoas());
				System.out.println("Data do evento: " + a[i].getData());
				System.out.println("Responsavel: " + a[i].getResponsavel());
				System.out.println("ID: " + a[i].getid_evento());
                          
			}
		}
              
}
    
    public static void main(String[] args) {
        
        int opcao =0;
        Scanner read = new Scanner(System.in);
        
       
       do{
                System.out.println("Indique a opcao que deseja!");
                System.out.println("1-Inserir");
                System.out.println("2-Listar");
                System.out.println("3-Procurar\n0-Sair");
                opcao = read.nextInt();
                
                switch(opcao){
                    
                    case 1: inserir(); break;
                    case 2: listar(); break;
                    case 3: procurar(); break;
                    case 0: System.out.println("Saida!");  break;
                    default: System.out.println("Opcao Invalida"); break;

                    }                
                
       }while(opcao !=0);
      
    }
}
