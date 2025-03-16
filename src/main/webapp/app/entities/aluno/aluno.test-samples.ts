import { IAluno, NewAluno } from './aluno.model';

export const sampleWithRequiredData: IAluno = {
  id: 8806,
  nome: 'boo tomorrow',
  sobreNome: 'more than',
};

export const sampleWithPartialData: IAluno = {
  id: 8243,
  nome: 'stunning following',
  sobreNome: 'tough whoa mould',
  email: 'Matteo_Jacobi@gmail.com',
};

export const sampleWithFullData: IAluno = {
  id: 25732,
  nome: 'oof near likewise',
  sobreNome: 'furiously',
  email: 'Genoveva_Mosciski65@gmail.com',
  cursoPretendido: 'incidentally dimly',
};

export const sampleWithNewData: NewAluno = {
  nome: 'energetically yet webbed',
  sobreNome: 'sock fooey likewise',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
