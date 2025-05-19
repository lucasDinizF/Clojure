(ns Lista-2.ddd)

(defn ddd [n]
  (cond (= n 61) "Brasilia"
        (= n 71) "Salvador"
        (= n 11) "Sao Paulo"
        (= n 21) "Rio de Janeiro"
        (= n 32) "Juiz de Fora"
        (= n 19) "Campinas"
        (= n 27) "Vitoria"
        (= n 31) "Belo Horizonte"
        :else "DDD nao cadastrado"))

(defn main []
  (let [n (read)]
    (println (ddd n))))

(main)