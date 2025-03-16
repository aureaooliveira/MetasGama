export interface IAluno {
  id: number;
  nome?: string | null;
  sobreNome?: string | null;
  email?: string | null;
  cursoPretendido?: string | null;
}

export type NewAluno = Omit<IAluno, 'id'> & { id: null };
