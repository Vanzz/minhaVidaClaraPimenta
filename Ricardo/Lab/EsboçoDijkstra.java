class Dijkstra {
	public Integer[] minDistPonderada(Grafo G, Vertice v){
		Vertice[] vs = G.vertices();
		Integer[] dists = new Integer[vs.length];
		
		//Inicializar
		for(int i = 0; i < dists.length; i++){
			dists[i] = vs[i].equals(v) ? 0 : Integer.MAX_VALUE;
		}
		FilaPrioridades fp = new FilaPrioridades(vs, dists);
		
		while (!fp.isEmpty()){
			Vertice u = fp.removeMin();
			for(Vertice adj : G.adjacentes(u)){
				if(relaxar(adj, u , dists))
					fp.minimizar(adj, /*completar*/);
			}
		}
		return dists;
	}
}