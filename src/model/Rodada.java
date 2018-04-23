package model;

import java.util.Date;
import java.util.List;


/**
 * Created by Marcelo on 19/04/2018.
 */
public class Rodada {
        public long id;
        private int status;
        private Date dataInicio;
        private Date dataFim;
        List<Jogo> listaJogos;

        public Rodada() {

        }

        public int getStatus() {
                return status;
        }

        public void setStatus(int status) {
                this.status = status;
        }

        public Date getDataInicio() {
                return dataInicio;
        }

        public void setDataInicio(Date dataInicio) {
                this.dataInicio = dataInicio;
        }

        public Date getDataFim() {
                return dataFim;
        }

        public void setDataFim(Date dataFim) {
                this.dataFim = dataFim;
        }

        public List<Jogo> getListaJogos() {
                return listaJogos;
        }

        public void setListaJogos(List<Jogo> listaJogos) {
                this.listaJogos = listaJogos;
        }
}
