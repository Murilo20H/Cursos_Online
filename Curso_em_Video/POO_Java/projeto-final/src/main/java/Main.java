public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de Java");
        v[1] = new Video("Aula 1 de C#");
        v[2] = new Video("Aula 1 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
        g[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");

        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(7);

        vis[2] = new Visualizacao(g[1], v[0]);
        vis[2].avaliar(87.0);

        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());
        System.out.println("\n--------------------------------------------\n");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\n--------------------------------------------\n");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
}
