export interface IAluno {
  id: number;
  nome?: string | null;
  sobreNome?: string | null;
  email?: string | null;
  cursoPretendido?: string | null;
  metas?: any[];
}

export type NewAluno = Omit<IAluno, 'id'> & { id: null };
