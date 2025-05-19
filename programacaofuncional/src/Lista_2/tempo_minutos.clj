(ns Lista-2.tempo-minutos)


(defn tempo [horai minutoi horaf minutof]
  (let [inicio (+ (* horai 60) minutoi)
        fim (+ (* horaf 60) minutof)
        duracao (cond (> fim inicio) (- fim inicio)
                      (= fim inicio) 1440
                      (< fim inicio) (+ (- 1440 inicio) fim))
        horas (quot duracao 60)
        minutos (mod duracao 60)]
    (println (str "O JOGO DUROU " horas " HORA(S) E " minutos " MINUTO(S)"))))



(defn main []
  (let [entrada (clojure.string/split (read-line) #"\s+")
        horasi (Integer/parseInt (nth entrada 0))
        minutosi (Integer/parseInt (nth entrada 1))
        horasf (Integer/parseInt (nth entrada 2))
        minutosf (Integer/parseInt (nth entrada 3))]
    (tempo horasi minutosi horasf minutosf)))

(main)