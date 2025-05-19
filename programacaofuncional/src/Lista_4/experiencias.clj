(ns Lista-4.experiencias)

(defn lista_especie [especie l_vazia lista]
  (if (= (str (last lista)) especie)
    (conj l_vazia (first lista))
    l_vazia
    ))

(defn porcentagem [x y]
  (let [div (/ (float x) (float y))]
    (format "%.2f" (* 100 div))))

(defn reduzir [especie l_vazia lista]
  (reduce + (reduce (partial lista_especie especie) l_vazia lista)))

(defn main []
  (let [n (read)
        lista (repeatedly n #(repeatedly 2 read))
        coelhos (reduzir "C" [] lista)
        ratos (reduzir "R" [] lista)
        sapos (reduzir "S" [] lista)
        total (+ coelhos ratos sapos)]
    (println "Total:" total "cobaias")
    (println "Total de coelhos:" coelhos)
    (println "Total de ratos:" ratos)
    (println "Total de sapos:" sapos)
    (println "Percentual de coelhos:" (porcentagem coelhos total) "%")
    (println "Percentual de ratos:" (porcentagem ratos total) "%")
    (println "Percentual de sapos:" (porcentagem sapos total) "%")
    ))

(main)