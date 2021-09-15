package portafolios;

import portafolios.BuilderPortafolio;
import portafolios.BuilderPortafolioConcreto;
import portafolios.Portafolio;

public class DirectorPortafolio {
    
    BuilderPortafolio builderPortafolio = new BuilderPortafolioConcreto();
    
    public Portafolio getPortafolioMenorDeEdad() {
        return null;
    }
    
}
