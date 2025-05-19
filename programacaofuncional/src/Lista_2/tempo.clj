(ns Lista-2.tempo)

(defn tempo [inicio fim]
  (let [tempo1 (- inicio fim)]
    (cond (> inicio fim) (let [tempo2 (- 24 tempo1)] (println (str "O JOGO DUROU " tempo2 " HORA(S)")))
        (= inicio fim) (println "O JOGO DUROU 24 HORA(S)")
        (< inicio fim) (println (str "O JOGO DUROU " tempo1 " HORA(S)"))
          )))

(defn main []
  (let [inicio (read)
        fim (read)]
    (tempo inicio fim)))

(main)