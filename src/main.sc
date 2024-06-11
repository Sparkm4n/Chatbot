require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Lasst uns beginnen.

    state: Hello
        intent!: /hello
        a: Hallo hallo

    state: Bye
        intent!: /bye
        a: Tschüss

    state: NoMatch
        event!: noMatch
        a: Ich verstehe nicht. Du sagtest: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}

