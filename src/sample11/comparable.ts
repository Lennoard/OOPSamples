import { FiguraGeometrica } from "./geometrics";

export interface IComparavel {
  comparar(f: FiguraGeometrica): number;
}
