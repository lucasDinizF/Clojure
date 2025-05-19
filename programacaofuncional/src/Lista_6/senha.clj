(ns Lista-6.senha)

(defn senha [x]
  (if (not= x 2002) "Senha Invalida"))


(defn main []
  (let [lista (take-while (fn [x] (not= x 2002)) (repeatedly read))]
    (doall (map (fn [x] (println (senha x))) lista))
    (println "Acesso Permitido")))

(main)