(ns programacaofuncional.teste)


(defn armazenamento [lista]
  (let [leitura (read)]
    (if (= (last lista) 3)
      (println lista)
      (recur (conj lista leitura)))))

(armazenamento [])
