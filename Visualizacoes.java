
package aula14pooexercicio;

public class Visualizacoes {
    private Gafanhoto espectador;
    private Video filme;
    
    public void like() {
        this.filme.setCurtidas(1);
    }
    
    public void play() {
       this.filme.setReproduzindo(true);
    }
    
    public void pause() {
        this.filme.setReproduzindo(false);
    }
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
       this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacoes " + espectador + ", filme = " + filme;
    }
    
    

    public Visualizacoes(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
        
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    }

