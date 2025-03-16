import { IMeta, NewMeta } from './meta.model';

export const sampleWithRequiredData: IMeta = {
  id: 17187,
  area: 'CNATUREZA',
  nota: 8276.76,
};

export const sampleWithPartialData: IMeta = {
  id: 15622,
  area: 'CHUMANAS',
  nota: 14504.61,
};

export const sampleWithFullData: IMeta = {
  id: 32703,
  area: 'LINGUAGENS',
  nota: 406.41,
};

export const sampleWithNewData: NewMeta = {
  area: 'CNATUREZA',
  nota: 27852.74,
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
