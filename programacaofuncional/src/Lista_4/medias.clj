(ns Lista-4.medias)

(defn medias [x])


(defn main []
  (let [n (read)
        rep (repeatedly n #(repeatedly 3 (read)))]
    (println (rep))))

(main)