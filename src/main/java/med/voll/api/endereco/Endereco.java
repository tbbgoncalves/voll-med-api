package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        this.logradouro = dados.logradouro() != null && !dados.logradouro().isBlank() ? dados.logradouro() : this.logradouro;

        this.bairro = dados.bairro() != null && !dados.bairro().isBlank() ? dados.bairro() : this.bairro;

        this.cep = dados.cep() != null && !dados.cep().isBlank() ? dados.cep() : this.cep;

        this.numero = dados.numero() != null && !dados.numero().isBlank() ? dados.numero() : this.numero;

        this.complemento = dados.complemento() != null && !dados.complemento().isBlank() ? dados.complemento() : this.complemento;

        this.cidade = dados.cidade() != null && !dados.cidade().isBlank() ? dados.cidade() : this.cidade;

        this.uf = dados.uf() != null && !dados.uf().isBlank() ? dados.uf() : this.uf;
    }
}
