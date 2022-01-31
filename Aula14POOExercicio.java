
package aula14pooexercicio;

public class Aula14POOExercicio {

    public static void main(String[] args) {
         
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de JAVA");
        v[2] = new Video("Aula de PHP");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Luiza", 30, "F","Teteco");
        g[1] = new Gafanhoto("Lucas", 33, "M", "Kurt");
        
        
        Visualizacoes vis[] = new Visualizacoes[5];
        vis[0] = new Visualizacoes(g[0], v[2]);
        vis[0].avaliar();
        vis[0].like();
        vis[0].play();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacoes(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        /*
        System.out.println(g[0].toString());
        System.out.println(v[0].toString());
        */
    }
    
}
