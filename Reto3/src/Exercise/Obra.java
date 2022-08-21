/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Obra {

    public static void main(String[] args) {
        ArrayList<Integer> categorias = new ArrayList<>();
        categorias.add(2);categorias.add(2);categorias.add(1);categorias.add(2);categorias.add(1);categorias.add(2);
        categorias.add(1);categorias.add(1);categorias.add(2);categorias.add(1);categorias.add(1);categorias.add(2);
        categorias.add(1);categorias.add(2);categorias.add(1);categorias.add(2);categorias.add(2);
        categorias.add(2);categorias.add(2);categorias.add(1);categorias.add(1);categorias.add(1);categorias.add(2);
        categorias.add(2);categorias.add(1);categorias.add(1);categorias.add(2);categorias.add(2);categorias.add(2);categorias.add(2);categorias.add(2);
        System.out.println("Metodo 1 ->"+ clases(categorias));
        System.out.println("Metodo 2 ->"+ clases1(categorias));
        System.out.println("Metodo 3 ->"+ clases2(categorias));


        //ArrayList<Integer> f = new ArrayList<>();
        //f.add(1);f.add(3);f.add(6);f.add(8);

        //ArrayList<Integer> t = new ArrayList<>();
        //t.add(1);t.add(2);t.add(5);t.add(5);t.add(5);t.add(1);t.add(2);t.add(5);t.add(5);t.add(5);
        //System.out.println(meFaltanDeLaClase(f, t, 2));

        /*ArrayList<Integer> a = new ArrayList<>();
        a.add(22);a.add(37);a.add(16);a.add(40);a.add(1);a.add(19);
        a.add(35);a.add(3);a.add(36);a.add(12);a.add(15);a.add(10);
        a.add(14);a.add(8);a.add(31);a.add(5);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(35);b.add(34);b.add(4);b.add(8);b.add(27);b.add(1);b.add(21);b.add(40);
        b.add(37);b.add(16);b.add(30);b.add(5);b.add(22);b.add(28);
        System.out.println(puedoCambiar(a,b));*/
    }

    public static ArrayList<Integer> clases(ArrayList<Integer> categoria){
        List<Integer> cat =
                categoria.stream().
                        distinct().
                        collect(Collectors.
                                toList());
        System.out.println("-------------FUNIIONES----------");
        return (ArrayList<Integer>) cat;
    }

    public static ArrayList<Integer> clases1(ArrayList<Integer> categoria){
        List<Integer> cat = new ArrayList<>();

        for(int i=0;i<categoria.size();i++){
            if(!cat.contains(categoria.get(i))){
                cat.add(categoria.get(i));
            }
        }
        System.out.println("-------------FOR----------");
        return (ArrayList<Integer>) cat;
    }

    public static ArrayList<Integer> clases2(ArrayList<Integer> categoria){
        List<Integer> cat = new ArrayList<>();
        for(int i=0;i<categoria.size();i++){
            System.out.println("I -> "+categoria.get(i));
            for(int j = 0; j<(categoria.get(i)-1);j++){
                System.out.println("J->"+ categoria.get(j));
                if(categoria.get(j) != categoria.get(j+1)){
                    cat.add(categoria.get(j));
                }
            }
        }
        System.out.println("-------------FOR 2----------");
        return (ArrayList<Integer>) cat;
    }

    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> faltan, ArrayList<Integer> tiene, int cate){
        ArrayList<Integer> posicion = new ArrayList<>();
        for(Integer i: faltan){
            if(tiene.get(i).equals(cate)){
                posicion.add(i);
            }
        }
        return posicion;
    }

    public static ArrayList<Integer> noTengo(ArrayList<Integer> categroiaA,ArrayList<Integer> categroiaB){
        ArrayList<Integer> no = new ArrayList<>();
        for(int i = 0; i<categroiaA.size();i++){
            if(!categroiaB.contains(categroiaA.get(i))){
                no.add(categroiaA.get(i));
            }
        }
        return no;
    }

    public static int puedoCambiar(ArrayList<Integer> categoriaA,ArrayList<Integer> categoriaB){
        int contador1 = 0;
        int contador2 = 0;
        int result;
        System.out.println("Hola");
        for(int  i = 0; i< categoriaA.size();i++){
            if(!categoriaB.contains(categoriaA.get(i))){
                contador1 += 1;
            }
        }
        for(int  i = 0; i< categoriaB.size();i++){
            if(!categoriaA.contains(categoriaB.get(i))){
                contador2 += 1;
            }
        }
        if(contador1>contador2){
            result = contador2;
        }else {
            result = contador1;
        }
        return result;
    }

}