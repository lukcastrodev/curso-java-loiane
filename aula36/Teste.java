package ctech.cursoJavaLoiane.aula36;

public class Teste {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Kratos");
        //contato.setEndereco("Atenas");
        //contato.setTelefone("11 99999-9999");

        //criar objeto endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Aleatória");
        end.setNumero("1452");
        end.setComplemento("CASA");
        end.setCidade("Cidade Aleatória");
        end.setEstado("SP");
        end.setCep("00000000");

        contato.setEndereco(end);

        //relacionamento tem-um telefone
        Telefone tel = new Telefone();
        tel.setTipo("celular");
        tel.setDdd("11");
        tel.setNumero("99999-9999");

        Telefone tel2 = new Telefone();
        tel2.setTipo("celular");
        tel2.setDdd("32");
        tel2.setNumero("91313-1313");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        //contato.setTelefone(tel);
        contato.setTelefones(telefones);

        //teste saída console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if(contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        //if(contato != null && contato.getTelefone() != null) {
        //    System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        //}

        if(contato != null && contato.getTelefones() != null) {
            for(Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }


    }
}
