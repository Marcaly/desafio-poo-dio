package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Professor {
        private String nome;
        private String especializacao;

        public Professor(String nome, String especializacao) {
            this.nome = nome;
            this.especializacao = especializacao;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEspecializacao() {
            return especializacao;
        }

        public void setEspecializacao(String especializacao) {
            this.especializacao = especializacao;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Professor professor = (Professor) o;
            return Objects.equals(nome, professor.nome) &&
                    Objects.equals(especializacao, professor.especializacao);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, especializacao);
        }

        @Override
        public String toString() {
            return "Professor{" +
                    "nome='" + nome + '\'' +
                    ", especializacao='" + especializacao + '\'' +
                    '}';
        }
}
